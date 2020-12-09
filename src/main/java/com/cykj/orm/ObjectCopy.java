package com.cykj.orm;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangfq on 2020/12/3.
 */
public class ObjectCopy {

    public static Object copy(Object source) {
        //创建一个新的对象
        Object target = null;
        //获取源对象的class对象
        Class clz = source.getClass();
        //实例化
        try {
            target = clz.newInstance();
            //获取类中的所有属性
            Field[] fields = clz.getDeclaredFields();
            for(Field field : fields) {
                //获取属性名
                String filedName = field.getName();
                //根据属性名获取get\set方法
                String set = "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
                String get = "get" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
                //根据方法名称获取方法对象
                Method methodSet = clz.getMethod(set, field.getType());
                Method methodGet = clz.getMethod(get);
                //执行源对象中的get方法，获取返回值
                Object returnVal = methodGet.invoke(source);
                //执行目标对象的set方法，将源对象的值赋值给目标对象
                methodSet.invoke(target, returnVal);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return target;
    }
}
