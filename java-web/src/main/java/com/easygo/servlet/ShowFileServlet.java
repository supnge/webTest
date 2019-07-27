package com.easygo.servlet;

import com.easygo.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ShowFileServlet")
public class ShowFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sPath= req.getParameter("sourcePath");

        String fileString = FileUtils.getFileMessage(sPath);

        resp.getWriter().write(fileString);
        System.out.println(fileString);
        req.setAttribute("fileString", fileString);
        req.getRequestDispatcher("fileList.jsp").forward(req, resp);
    }
}
