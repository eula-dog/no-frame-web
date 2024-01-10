package com.frxxz.service.schedule;

import com.frxxz.bean.ScheduleBean;
import com.frxxz.dao.schedule.ScheduleDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class ScheduleService {

    protected ScheduleDao scheduleDao = new ScheduleDao();
    public Boolean addSchedule(ScheduleBean scheduleBean) throws SQLException {
        return scheduleDao.addSchedule(scheduleBean);
    }

    public ArrayList<ScheduleBean> selectSchedules(Map<String, String> queryMap) throws SQLException {
        return scheduleDao.selectSchedules(queryMap);
    }
}
