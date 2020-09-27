package com.company;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DataSource {
    public static void main(String[] args)  {
        //创建一个Datasource 接口的实现类
        BasicDataSource bds=new BasicDataSource();
        //链接数据库 通过setxxx 可以将其设置进去
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/ljjsb");
        bds.setUsername("root");
        bds.setPassword("a654320a");
        //获取数据库链接
        try {
            Connection c=bds.getConnection();
            QueryRunner qr=new QueryRunner();
            String sql= "select * from user";
           qr.query(c,sql,new ArrayListHandler());
        }catch (Exception E){
            E.printStackTrace();//给程序员看的
            throw  new  RuntimeException(E+"数据库链接失败");// 给客户看的
        }
    }
}
