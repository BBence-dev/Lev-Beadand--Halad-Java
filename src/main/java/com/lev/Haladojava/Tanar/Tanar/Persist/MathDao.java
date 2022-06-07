package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Math;

import java.util.List;

public interface MathDao {
    Math getMath(int id);
    List<Math> getAllMath();
    void createMath(Math math);
    void updateMath(Math math);
}
