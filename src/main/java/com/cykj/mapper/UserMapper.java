package com.cykj.mapper;

import com.cykj.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by wangfq on 2020/12/4.
 */
public interface UserMapper {

    void addUser(UserInfo userInfo);
    void deleteUserById(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    List<UserInfo> findAll(RowBounds rb);
    List<UserInfo> findIn();
}
