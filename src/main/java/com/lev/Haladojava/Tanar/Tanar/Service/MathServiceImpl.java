package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Math;
import com.lev.Haladojava.Tanar.Tanar.Persist.MathDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathServiceImpl implements MathService {

    private MathDao mathDao;

    public MathServiceImpl(MathDao mathDao){
        this.mathDao = mathDao;
    }

    @Override
    public List listAllMath() {
        return mathDao.getAllMath();
    }

    @Override
    public void createNewMath(Math math) {
        mathDao.createMath(math);
    }

    @Override
    public void modifyMath(Math math) {
        mathDao.updateMath(math);
    }

}
