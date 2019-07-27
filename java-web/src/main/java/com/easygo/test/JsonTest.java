package com.easygo.test;

import com.easygo.domain.Book;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // 1. 对象转json字符串
        Book book = new Book(1, "java入门", "chinadaily", "99");

        String bookStr = objectMapper.writeValueAsString(book);

        System.out.println(bookStr);

        // 2. List转json字符串
        List<Book> bookList= new ArrayList<>();
        bookList.add(new Book(1, "java入门", "chinaDaily", "99"));
        bookList.add(new Book(2, "js入门", "american", "89"));
        bookList.add(new Book(3, "python入门", "english", "69"));
        bookList.add(new Book(4, "c#入门", "", "79"));

        String bookListStr = objectMapper.writeValueAsString(bookList);
        System.out.println(bookListStr);


        // 3. Map转json字符串
        Map<String, String> messageMap = new HashMap<>();
        messageMap.put("name", "zhangsan");
        messageMap.put("password", "123");
        messageMap.put("age", "22");
        System.out.println(objectMapper.writeValueAsString(messageMap));

        // 4. json字符串转对象
        String books = "{\"id\":1,\"name\":\"java入门\",\"author\":\"chinaDaily\",\"price\":\"99\"}";
        System.out.println(books);
        Book boo = objectMapper.readValue(books, Book.class);

        System.out.println(boo.getName());


    }
}
