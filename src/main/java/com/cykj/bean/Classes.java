package com.cykj.bean;

import java.util.List;

/**
 * Created by wangfq on 2020/12/4.
 */
public class Classes {

    private int classId;
    private String className;
    private List<UserInfo> userList;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<UserInfo> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfo> userList) {
        this.userList = userList;
    }
}
