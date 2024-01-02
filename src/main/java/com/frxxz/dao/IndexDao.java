package com.frxxz.dao;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.bean.CommentBean;
import com.frxxz.bean.IndexQuestionBean;
import com.frxxz.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IndexDao {

    private Connection con = SqlUtil.getConnection();

    public ArrayList<CatalogueBean> getAllIndexCatalogue(int id) throws SQLException {
        ArrayList<CatalogueBean> result = new ArrayList<>();
        String sql = "select * from catalogue where type=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            int cid = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int type = resultSet.getInt("type");
            int level = resultSet.getInt("level");
            String href = resultSet.getString("href");
            CatalogueBean catalogueBean = new CatalogueBean(cid,name,type,level,href);
            result.add(catalogueBean);
        }

        return result;
    }

    public boolean addQuestion(IndexQuestionBean indexQuestionBean) throws SQLException {

        String sql = "insert into todo (name,description,time) values (?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,indexQuestionBean.getName());
        preparedStatement.setString(2,indexQuestionBean.getDescription());
        preparedStatement.setString(3,indexQuestionBean.getDatetime());
        int result = preparedStatement.executeUpdate();

        return result>0;
    }

    public ArrayList<IndexQuestionBean> getIndexQuestion() throws SQLException {

        ArrayList<IndexQuestionBean> result = new ArrayList<>();
        String sql = "select * from todo";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            int cid = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String content = resultSet.getString("description");
            String time = resultSet.getString("time");
            IndexQuestionBean catalogueBean = new IndexQuestionBean(cid,name,content,time);
            result.add(catalogueBean);
        }
        return result;
    }


    public ArrayList<CommentBean> selectCommentsByQuestionId(int id) throws SQLException {

        ArrayList<CommentBean> result = new ArrayList<>();
        String sql = "select * from comment where question_id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int cid = resultSet.getInt("id");
            String comment = resultSet.getString("comment");
            int type = resultSet.getInt("type");
            String time = resultSet.getString("time");
            int questionId = resultSet.getInt("question_id");
            CommentBean commentBean = new CommentBean(cid,comment,type,time,questionId);
            result.add(commentBean);
        }
        return result;
    }
}
