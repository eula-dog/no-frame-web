package com.frxxz.dao;

import com.frxxz.bean.DescriptionBean;
import com.frxxz.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DescriptionBeanDao {
    private Connection con = SqlUtil.getConnection();

    public ArrayList<DescriptionBean> getAllDescriptions() throws SQLException {
      ArrayList<DescriptionBean> descriptions = new ArrayList<>();

        String sql = "select * from description";
        PreparedStatement statement = con.prepareStatement(sql);
        //statement.setLong(1,11L);
        //执行SQL语句
        ResultSet result = statement.executeQuery();

        while(result.next()){
            int id = result.getInt("id");
            String name = result.getString("name");
            String description = result.getString("description");
            DescriptionBean descriptionBean = new DescriptionBean(id,name,description);
            descriptions.add(descriptionBean);
        }

        //con.close();
        result.close();
        statement.close();

        return descriptions;
    }


    public DescriptionBean getOneDescription(int id) throws SQLException{

        String sql = "select * from description where id=?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1,id);

        ResultSet result = statement.executeQuery();

        while(result.next()){
            int did = result.getInt("id");
            String name = result.getString("name");
            String description = result.getString("description");
            DescriptionBean descriptionBean = new DescriptionBean(did,name,description);
            return descriptionBean;
        }
        return null;
    }
}
