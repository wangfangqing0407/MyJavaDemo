package com.cykj.bean;


/**
 * Created by wangfq on 2020/12/4.
 */
public class UserInfo {

    private int id;
    private String userName;
    private String password;
    private int age;
    private Classes classesInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classes getClassesInfo() {
        return classesInfo;
    }

    public void setClassesInfo(Classes classesInfo) {
        this.classesInfo = classesInfo;
    }

}
