package com.easygo.dao;

import com.easygo.domain.User;

/**
 * Author:   supeng
 * Date:     2019-07-12 10:49
 * Description:  dao
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface IUserDao {
    public boolean insert(User user);
    public User findUser(String username, String password);
    public User findUser(String username);
}
