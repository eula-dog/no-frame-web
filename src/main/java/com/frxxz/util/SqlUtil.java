package com.frxxz.util;

import com.frxxz.mytest.TestSql;

import java.sql.*;
import java.util.ArrayList;

public class SqlUtil{
    private static String url = "jdbc:mysql://127.0.0.1:3306/frxxz?serverTimezone=GMT%2B8";
    private static String username = "root";
    private static String password = "123456";


    public static Connection getConnection(){
        try{
            //首先加载驱动   com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(Exception e){
            System.out.println("加载驱动失败！");
            return null;
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            return con;
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.out.println("获取连接失败");
            return null;
        }

    }


}
