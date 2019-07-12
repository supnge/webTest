package com.easygo.exception;

/**
 * Author:   supeng
 * Date:     2019-07-12 11:44
 * Description:  UserException
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class UserException extends Exception{
    public UserException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public UserException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public UserException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}