package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Timetable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TimetableImpl implements TimetableDao {

    private Map<Integer, Timetable> TimetableMap;

    public TimetableImpl(){
        TimetableMap=new HashMap<>();
        TimetableMap.put(1,new Timetable(
                1,
                "9c",
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                25
        ));
    }

    @Override
    public Timetable getTimetable(int id) {
        return TimetableMap.get(id);
    }

    @Override
    public List<Timetable> getALLTimetable() {
        return new ArrayList<Timetable>(TimetableMap.values());
    }

    @Override
    public void insertTimetable(Timetable timetable) {
        TimetableMap.put(timetable.getId(), timetable);
    }

    @Override
    public void updateTimetable(Timetable timetable) {
        TimetableMap.put(timetable.getId(), timetable);
    }
}
