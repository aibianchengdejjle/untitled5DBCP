package com.company;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.net.DatagramPacket;
import java.sql.Connection;
import java.util.List;

public class test {
    public static void main(String[] args) {
        try {
            Connection c=creategongju.getbss().getConnection();
            QueryRunner qr=new QueryRunner();
            String sql="select * from sort";
            List<Object[]>q =qr.query(c,sql,new ArrayListHandler());
            for (Object[]b:q
                 ) {
                for (Object s:b
                     ) {
                    System.out.print(s+"    ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
