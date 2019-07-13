package com.easygo.servlet;

import com.easygo.Service.IUserService;
import com.easygo.domain.User;
import com.easygo.Service.impl.IUserServiceImpl;
import com.easygo.domain.UserForm;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Author:   supeng
 * Date:     2019-07-12 11:27
 * Description:  RegisterServlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    IUserService userService = new IUserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        UserForm uf = new UserForm();
        ConvertUtils.register(new DateLocaleConverter(), Date.class);
        try {
            // UserForm 验证
            BeanUtils.populate(uf, req.getParameterMap());

            if(uf.validate()){
                req.setAttribute("uf", uf);
                req.getRequestDispatcher("register.jsp").forward(req, resp);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("注册失败"+e.getMessage());
        }
        //注册
        try {
            User user = new User();
            //把参数转成JavaBean
            BeanUtils.populate(user, req.getParameterMap());
            if(userService.userExsit(user) != null){//检验是否存在同名的用户
                uf.getErr().put("username", "用户已经存在了");
                req.setAttribute("uf", uf);
                req.getRequestDispatcher("/register.jsp").forward(req, resp);
            }else{
                //插入数据
                userService.register(user);
                //注册成功
                resp.getWriter().write("注册成功，3秒后转回主页，请点登录");
                resp.setHeader("refresh", "3;url=" + req.getContextPath()
                        + "/index.jsp");
            }
        }catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            resp.getWriter().write("注册失败，" + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // TODO Auto-generated method stub
        User user = new User();
        try {
            //给BeanUtils注册一个日期转换器
			/*ConvertUtils.register(new Converter() {
				@Override
				public Object convert(Class type, Object value) {
					// TODO Auto-generated method stub
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String birthday = (String)value;
					Date date = null;
					try {
						date = sdf.parse(birthday);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return date;
				}
			}, Date.class);*/
            ConvertUtils.register(new DateLocaleConverter(), Date.class);//等同于上面的
            //把参数转成JavaBean
            BeanUtils.populate(user, request.getParameterMap());

            //插入数据
            userService.register(user);

            //注册成功
            response.getWriter().write("注册成功，3秒后转回主页，请点登录");
            response.setHeader("refresh", "3;url=" + request.getContextPath()
                    + "/index.jsp");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            response.getWriter().write("注册失败，" + e.getMessage());
        }
    }
}
