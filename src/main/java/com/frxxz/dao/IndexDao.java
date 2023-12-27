package com.frxxz.dao;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IndexDao {

    private Connection con = SqlUtil.getConnection();

    public ArrayList<CatalogueBean> getAllIndexCatalogue() throws SQLException {
        ArrayList<CatalogueBean> result = new ArrayList<>();
        String sql = "select * from catalogue";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int type = resultSet.getInt("type");
            int level = resultSet.getInt("level");
            String href = resultSet.getString("href");
            CatalogueBean catalogueBean = new CatalogueBean(id,name,type,level,href);
            result.add(catalogueBean);
        }

        return result;
    }
}
