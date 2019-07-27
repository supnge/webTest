package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 取源文件名
        String sourceFileName = req.getParameter("fileName");
        sourceFileName = sourceFileName.split("\\：")[1];
        System.out.println("sourceFileName:"+sourceFileName);
        String suffix = sourceFileName.split("\\.")[sourceFileName.split("\\.").length-1];

        // 设置目标文件名
        String targetFileName = /*UUID.randomUUID().toString()+*/"输出文件"+"."+suffix;
        System.out.println("targetFileName:"+targetFileName);
        targetFileName = URLEncoder.encode(targetFileName, "UTF-8");

        resp.setHeader("Content-Disposition","attachment;filename=" + targetFileName);
        resp.setContentType("application/octet-stream");

        //4.响应文件
        File file = new File(sourceFileName);
        InputStream is = new FileInputStream(file);

        byte[] bytes = new byte[1024 * 8];
        int len;
        OutputStream os = resp.getOutputStream();
        while((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        //5.关闭流
        is.close();
        os.close();

    }
}
