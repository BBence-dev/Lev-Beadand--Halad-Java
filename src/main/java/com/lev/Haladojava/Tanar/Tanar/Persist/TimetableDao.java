package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Timetable;

import java.util.List;

public interface TimetableDao {
    Timetable getTimetable(int id);
    List<Timetable> getALLTimetable();
    void insertTimetable(Timetable timetable);
    void updateTimetable(Timetable timetable);

}
