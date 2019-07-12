package com.easygo.Service.impl;

import com.easygo.Service.IUserService;
import com.easygo.dao.IUserDao;
import com.easygo.dao.impl.IUserDaoImpl;
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
    public boolean register(User user) {
        // TODO Auto-generated method stub
        return userDao.insert(user);
    }

    @Override
    public User login(String username, String password) {
        // TODO Auto-generated method stub
        return userDao.findUser(username, password);
    }

    @Override
    public User login(User user) throws UserException{
        // TODO Auto-generated method stub
        User u = userDao.findUser(user.getUsername(), user.getPassword());
        if(u == null){
            throw new UserException("用户或者密码不存在");
        }
        return u;
    }

    @Override
    public User userExsit(User user) {
        // TODO Auto-generated method stub
        return userDao.findUser(user.getUsername());
    }

}