package com.cykj.orm;

import com.cykj.bean.OrmTestBean;
import com.cykj.bean.TestTable;
import org.dom4j.Element;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * Created by wangfq on 2020/12/3.
 */
public class OrmTest {

    public static void main(String[] args) {
        TestTable tt = new TestTable();
        tt.setName("peter");
        tt.setPwd("123456");
        Element root = MappingUtils.fetchXml();
        Element foo;
        for(Iterator i = root.elementIterator("table"); i.hasNext();) {
            foo = (Element) i.next();
            String sql = MappingUtils.fetchInsertSql(foo.attributeValue("name"));
            System.out.println("sql: " + sql);
        }

    }
}
