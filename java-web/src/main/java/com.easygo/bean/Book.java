package com.easygo.bean;

/**
 * Author:   supeng
 * Date:     2019-07-08 9:54
 * Description:  Book
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String price;

    public Book(int i, String java, String easygo, String s) {
        this.id = i;
        this.name = java;
        this.author = easygo;
        this.price = s;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}