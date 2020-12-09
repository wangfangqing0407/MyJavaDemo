package com.cykj.mapper;

import com.cykj.bean.Classes;
import com.cykj.bean.UserInfo;

import java.util.List;

/**
 * Created by wangfq on 2020/12/4.
 */
public interface ClassesMapper {

    List<Classes> findAllClasses();

    List<UserInfo> findAllUser();

    List<Classes> findUserByJoin();

    List<UserInfo> findUser();
}
