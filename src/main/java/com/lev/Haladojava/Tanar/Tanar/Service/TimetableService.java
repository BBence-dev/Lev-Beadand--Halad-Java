package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Timetable;

import java.util.List;

public interface TimetableService {
    List <Timetable>listAllTimetable();
    Timetable getOneTimetable(int id);
    void modifyTimetable(Timetable timetable);
    void createTimetable(Timetable timetable);
}
