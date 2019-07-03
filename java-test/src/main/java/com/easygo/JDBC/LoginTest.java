package com.easygo.JDBC;

import com.easygo.bean.User;
import com.easygo.service.UserService;

import java.util.Scanner;

/**
 * Author:   supeng
 * Date:     2019-07-03 16:57
 * Description:  login
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class LoginTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        UserService userService = new UserService();
        User user = userService.findUser(username, password);

        if(user.getName()==null || user.getPassword()== null){
            System.out.println("登录失败");
        }
        else {
            System.out.println("登录成功");
        }


    }
}