package com.frxxz.dao.schedule;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.bean.ScheduleBean;
import com.frxxz.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class ScheduleDao {

    private Connection con = SqlUtil.getConnection();

    public Boolean addSchedule(ScheduleBean scheduleBean) throws SQLException {
        String sql = "insert into schedule (schedule,detail,start_time) values (?,?,?)";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,scheduleBean.getSchedule());
        preparedStatement.setString(2,scheduleBean.getDetail());
        preparedStatement.setString(3,scheduleBean.getDateTime());

        int result = preparedStatement.executeUpdate();

        return result>0;
    }

    public ArrayList<ScheduleBean> selectSchedules(Map<String, String> queryMap) throws SQLException {

        String sql = "select * from schedule";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<ScheduleBean> result = new ArrayList<>();
        while(resultSet.next()){
            int cid = resultSet.getInt("id");
            String schedule = resultSet.getString("schedule");
            String detail = resultSet.getString("detail");
            String startTime = resultSet.getString("start_time");
            int status = resultSet.getInt("status");
            ScheduleBean scheduleBean = new ScheduleBean(cid,schedule,detail,startTime,status+"");
            result.add(scheduleBean);
        }
        return result;
    }
}
