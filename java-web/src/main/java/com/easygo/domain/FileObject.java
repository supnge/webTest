package com.easygo.domain;

import java.util.ArrayList;
import java.util.List;

public class FileObject {
    private  String  id;
    private String name ;
    private String size ;
    private String date ;
    private List<FileObject> children =new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<FileObject> getChildren() {
        return children;
    }

    public void setChildren(List<FileObject> children) {
        this.children = children;
    }
}
