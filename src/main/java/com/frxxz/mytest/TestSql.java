package com.frxxz.mytest;

import com.frxxz.bean.DescriptionBean;
import com.frxxz.dao.DescriptionBeanDao;
import com.frxxz.util.SqlUtil;

import java.sql.ResultSet;
import java.util.ArrayList;

public class TestSql {
    public static void main(String[] args) throws Exception{
        DescriptionBeanDao dao = new DescriptionBeanDao();
        ArrayList<DescriptionBean> descriptions = dao.getAllDescriptions();
        for (DescriptionBean d:descriptions) {
            System.out.println(d);
        }

    }
}
