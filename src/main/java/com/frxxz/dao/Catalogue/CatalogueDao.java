package com.frxxz.dao.Catalogue;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CatalogueDao {

    private Connection con = SqlUtil.getConnection();

    public Boolean addCatalogue(CatalogueBean catalogueBean) throws SQLException {
        String sql = "insert into catalogue (name,type,level,href) values (?,?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,catalogueBean.getName());
        preparedStatement.setInt(2,catalogueBean.getType());
        preparedStatement.setInt(3,catalogueBean.getLevel());
        preparedStatement.setString(4,catalogueBean.getHref());
        int affectRows = preparedStatement.executeUpdate();
        return affectRows>0;
    }
}
