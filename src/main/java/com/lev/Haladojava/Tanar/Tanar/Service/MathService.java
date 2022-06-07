package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Math;

import java.util.List;

public interface MathService {
    List listAllMath();
    void createNewMath(Math math);
    void modifyMath(Math math);
}
