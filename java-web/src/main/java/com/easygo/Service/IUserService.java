package com.easygo.Service;

import com.easygo.domain.User;
import com.easygo.exception.UserException;

/**
 * Author:   supeng
 * Date:     2019-07-12 11:01
 * Description:  service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface IUserService {
    public void register(User user);
    public User login(String username, String password) throws UserException;
}
