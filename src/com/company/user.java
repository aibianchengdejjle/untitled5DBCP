package com.company;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import java.util.List;

public class user {
        private  static QueryRunner qr=new QueryRunner(creategongju.getbss());
        public  user(){}
        public static  boolean login(String username,String password){
            boolean flag=false;
            String sql="select * from users where username=? and password=?";
            String []b={username,password};
            try {
                List<Object[]>a=qr.query(sql,new ArrayListHandler(),b);
                if(a.size()>0)
                {
                    flag=true;
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return flag;
        }
        public  static  boolean checkusername(String username1){
            boolean flag1 =true;
            String sql="select * from users where username=?";
            String []c={username1};
            try {
                List<Object[]>b=qr.query(sql,new ArrayListHandler(),c);
                if(b.size()>0)
                    flag1=false;
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return  flag1;
        }
        public  static  boolean register(String username,String password){
            int row=0;
            boolean flag =false;
            String sql="INSERT INTO users (username,password) VALUES (?,?)";
            Object []d={password,username};
            try {
                 row=qr.update(sql,d);
            }catch (Exception e)
            {
             e.printStackTrace();
            }
             return flag=row>0?true:false;
        }
}
