package com.company;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class test1 {
    public static void main(String[] args) throws SQLException {
        BasicDataSource bds=creategongju.getbss();
        Connection c=bds.getConnection();
        String sql="select * from users";
        QueryRunner qr=new QueryRunner();
        List<Object[]>a=qr.query(c,sql,new ArrayListHandler());
        for (Object []B:a
             ) {
            for (Object r:B
                 ) {
                System.out.print(r+"    ");
            }
            System.out.println();
        }
    }
}
