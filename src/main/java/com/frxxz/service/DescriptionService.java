package com.frxxz.service;

import com.frxxz.bean.DescriptionBean;
import com.frxxz.dao.DescriptionBeanDao;

import java.sql.SQLException;

public class DescriptionService {
    private DescriptionBeanDao descriptionBeanDao = new DescriptionBeanDao();
    public DescriptionBean getOneDescription(int id) throws SQLException {

        return descriptionBeanDao.getOneDescription(id);
    }
}
