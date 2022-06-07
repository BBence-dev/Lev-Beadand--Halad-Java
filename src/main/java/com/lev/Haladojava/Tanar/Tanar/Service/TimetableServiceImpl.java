package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Timetable;
import com.lev.Haladojava.Tanar.Tanar.Persist.TimetableDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableServiceImpl implements TimetableService {

    private TimetableDao timetableDao;

    public TimetableServiceImpl(TimetableDao timetableDao){
        this.timetableDao = timetableDao;
    }

    @Override
    public List listAllTimetable() {
        return timetableDao.getALLTimetable();
    }

    @Override
    public Timetable getOneTimetable(int id) {
        return timetableDao.getTimetable(id);
    }

    @Override
    public void modifyTimetable(Timetable timetable) {
        timetableDao.updateTimetable(timetable);
    }

    @Override
    public void createTimetable(Timetable timetable) {
        timetableDao.insertTimetable(timetable);
    }
}
