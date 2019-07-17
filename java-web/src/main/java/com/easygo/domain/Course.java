package com.easygo.domain;

public class Course {
    private Integer id;

    private String name;

    private Integer schooltime;

    private Integer addr;

    private Short credit;

    private String courseinfo;

    private String teachername;

    private String teacherinfo;

    private Boolean isfinish;

    private Integer specialtyid;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getSchooltime() {
        return schooltime;
    }

    public void setSchooltime(Integer schooltime) {
        this.schooltime = schooltime;
    }

    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    public String getCourseinfo() {
        return courseinfo;
    }

    public void setCourseinfo(String courseinfo) {
        this.courseinfo = courseinfo == null ? null : courseinfo.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeacherinfo() {
        return teacherinfo;
    }

    public void setTeacherinfo(String teacherinfo) {
        this.teacherinfo = teacherinfo == null ? null : teacherinfo.trim();
    }

    public Boolean getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(Boolean isfinish) {
        this.isfinish = isfinish;
    }

    public Integer getSpecialtyid() {
        return specialtyid;
    }

    public void setSpecialtyid(Integer specialtyid) {
        this.specialtyid = specialtyid;
    }
}