package com.easygo.serviceImpl;

import com.easygo.Service.IUserService;
import com.easygo.dao.IUserDao;
import com.easygo.daoImpl.IUserDaoImpl;
import com.easygo.domain.User;
import com.easygo.exception.UserException;

/**
 * Author:   supeng
 * Date:     2019-07-12 11:10
 * Description:  impl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class IUserServiceImpl implements IUserService {
    IUserDao userDao = new IUserDaoImpl();

    @Override
    public void register(User user) {
        userDao.insert(user);
    }

    @Override
    public User login(String username, String password) throws UserException{
        User user =  userDao.findUser(username, password);
        if(user == null){
            throw new UserException("用户名或者密码错误");
        }
        return user;
    }
}