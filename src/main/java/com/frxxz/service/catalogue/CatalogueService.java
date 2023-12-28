package com.frxxz.service.catalogue;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.dao.Catalogue.CatalogueDao;

import java.sql.SQLException;

public class CatalogueService {

    private CatalogueDao catalogueDao = new CatalogueDao();
    public boolean addCatalogue(CatalogueBean catalogueBean) throws SQLException {
        Boolean insertFlag = catalogueDao.addCatalogue(catalogueBean);
        return  insertFlag;
    }
}
