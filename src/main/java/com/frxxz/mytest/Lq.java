package com.frxxz.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Lq {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");


        //获取connection连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/frxxz?serverTimezone=GMT%2B8",
                "root",
                "123456"
        );
        System.out.println(connection);

        /*新增*/
        String sql ="insert into description (name,description) values (?,?)";
        String name ="测试";
        String describe = "ceshi";
        //创建preparedStatement---防止SQL注入
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,describe);
        int num = preparedStatement.executeUpdate();
        if (num>0){
            System.out.println("新增成功");
        }


    }
}
