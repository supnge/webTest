package com.easygo.utils;

import com.easygo.bean.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:   supeng
 * Date:     2019-07-08 9:56
 * Description:  utils
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class DBUtils {
    private static Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

    static{
        bookMap.put(1, new Book(1, "Java", "easygo", "189"));
        bookMap.put(2, new Book(2, "JavaScript", "easygo", "189"));
        bookMap.put(3, new Book(3, "Python", "easygo", "189"));
        bookMap.put(4, new Book(4, "SSH", "easygo", "189"));
        bookMap.put(5, new Book(5, "Maven", "easygo", "189"));
    }

    public static Map<Integer, Book> getAllBooks(){
        return bookMap;
    }
    public static Book findBookById(Integer id){
        return bookMap.get(id);
    }
}