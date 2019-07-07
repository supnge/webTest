package com.easygo.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class HelloServlet4 extends HttpServlet {

    /*输出随机图片(CAPTCHA图像):Completely Automated Public Turing Test to Tell Computers and Humans Apart (全自动区分计算机和人类的测试)
    相关主要类(JDK 查看API)
    BufferedImage:内存图像
    Graphics：画笔
    ImageIO：输出图像*/
    int WIDTH = 120;
    int HEIGHT = 30;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();

        graphics.setColor(Color.yellow);

        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        graphics.setColor(Color.BLACK);

        //加干扰线
        for(int i=0;i<4;i++){
            int xStart = new Random().nextInt(WIDTH);
            int yStart = new Random().nextInt(HEIGHT);
            int xEnd = new Random().nextInt(WIDTH);
            int yEnd = new Random().nextInt(HEIGHT);
            graphics.drawLine(xStart, yStart, xEnd, yEnd);
        }

        int x = 5;
        //画随机数
        for(int i = 0; i< 4;i++){
            graphics.drawString(new Random().nextInt(9) + "", x, 20);
            x+=20;
        }

        //输出图片 设置响应格式
        resp.setContentType("image/jpeg");
        ImageIO.write(bufferedImage, "JPEG",resp.getOutputStream());

    }
}
