package com.frxxz.service;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.dao.IndexDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class IndexService {

    private IndexDao indexDao = new IndexDao();
    public ArrayList<CatalogueBean> getAllIndexCatalogue(int id) throws SQLException {
        return indexDao.getAllIndexCatalogue(id);
    }
}
