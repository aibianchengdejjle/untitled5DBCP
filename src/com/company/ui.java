package com.company;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
public class ui {
   static String uesrname;
   static String password;
    public static void main(String[] args) {
        System.out.println("请选择你要选择的操作");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("请输入用户名");
                String username=sc.next();
                System.out.println("请输入密码");
                String password=sc.next();
                if(user.login(username,password)){
                    System.out.println("登陆成功");
                }else {
                    System.out.println("登陆失败");
                }
                break;
            case 2:
                System.out.println("请输入用户名");
                String username1=sc.next();
                if(user.checkusername(username1))
                {
                    System.out.println("请输入密码");
                    String password1=sc.next();
                    if(user.register(username1,password1))
                    {
                        System.out.println("注册成功");
                    }else {
                        System.out.println("注册失败");
                    }

                }else {
                    System.out.println("该用户名已经存在");
                }
                break;
            default:
        }
    }
}
