package com.frxxz.service;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.bean.CommentBean;
import com.frxxz.bean.IndexQuestionBean;
import com.frxxz.dao.IndexDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class IndexService {

    private IndexDao indexDao = new IndexDao();
    public ArrayList<CatalogueBean> getAllIndexCatalogue(int id) throws SQLException {
        return indexDao.getAllIndexCatalogue(id);
    }

    public boolean addQuestion(IndexQuestionBean indexQuestionBean) throws SQLException {


        return indexDao.addQuestion(indexQuestionBean);
    }

    public ArrayList<IndexQuestionBean> getIndexQuestion() throws SQLException {
        return indexDao.getIndexQuestion();
    }

    public ArrayList<CommentBean> selectCommentsByQuestionId(int id) throws SQLException {
        return indexDao.selectCommentsByQuestionId(id);
    }
}
