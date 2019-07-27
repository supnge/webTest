package com.easygo.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        /*
        InputStream inputStream = req.getInputStream();

        byte[] bytes = new byte[1024];
        int length;

        while ((length=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes, 0, length, "UTF-8"));
            System.out.println(length);
        }


        inputStream.close();
        */
        /**
         * 使用fileupload实现文件上传：
         */
        //1.判断是否为文件上传表单
        String username = req.getParameter("username");
        System.out.println(username);
        if (ServletFileUpload.isMultipartContent(req)) {
            //2.创建个文件工厂
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            //3.创建文件上传对象
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            //4.解析请求
            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);

                for (FileItem item : list) {

                    if (item.isFormField()) {
                        processFormField(item);
                    } else {
                        processField(item);
                    }
                }

            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        }

        // 返回文件夹下的文件
        String realPath = this.getServletContext().getRealPath("/WEB-INF/upload/");
        // list这个参数应该放在递归方法外面 ，如果在递归方法里新建的话，返回时只会返回最上一层信息
        List<String> list = new ArrayList<>();
        List<String> fileList = getFiles(realPath, list);
        try {
            if (fileList.size() > 0) {
                req.setAttribute("fileList", fileList);
                req.getRequestDispatcher("/admin/products/listFiles.jsp").forward(req, resp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void processFormField(FileItem item) throws UnsupportedEncodingException {
        String fieldName = item.getFieldName();
        String fieldValue = item.getString("UTF-8");
        System.out.println(fieldName + ":" + fieldValue);
    }

    private void processField(FileItem item) throws UnsupportedEncodingException {
        String fieldName = item.getFieldName();
        String fieldValue = item.getString("UTF-8");
        System.out.println("fieldName:" + fieldName + "fieldValue:"+fieldValue +"itemName" + item.getName());
        String suffix = item.getName().split("\\.")[1];
        String saveFileName = UUID.randomUUID().toString() + "." + suffix;
        // 根据用户名进行命名
        saveFileName = "zhangsan" + "-" + saveFileName;
        System.out.println(saveFileName + ":" + item.getContentType());

        //2.创建文件保存的文件夹
        // 按日期进行保存
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String folderPath = this.getServletContext().getRealPath("/WEB-INF/upload/" + simpleDateFormat.format(new Date()));

        System.out.println("保存的路径:" + folderPath);
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        //3.保存文件
        //文件完整保存路径
        String filePath = folderPath + "/" + saveFileName;
        try {
            item.write(new File(filePath));
            item.delete();//删除临时文件
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取文件内容
     */
    public List<String> getFiles(String filePath, List<String> list) {

        File file = new File(filePath);

        // 如果是文件夹
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    System.out.println("目录：" + files[i].getPath());
                    list.add("目录：" + files[i].getPath());
                    getFiles(files[i].getPath(), list);
                } else {
                    System.out.println("文件：" + files[i].getPath());
                    list.add("文件：" + files[i].getPath());
                }

            }
        } else {
            System.out.println("文件：" + file.getPath());
            list.add("文件：" + file.getPath());
        }
        System.out.println(list.size()); // 递归情况下，会打印两次！！！
        return list;
    }


}
