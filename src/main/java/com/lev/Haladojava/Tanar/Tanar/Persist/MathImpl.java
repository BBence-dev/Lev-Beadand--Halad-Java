package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Math;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MathImpl implements MathDao {

    private Map<Integer, Math> MathMap;

    public MathImpl(){
        MathMap = new HashMap<>();
        MathMap.put(1,new Math(1,"Sándor",30,41));
    }
    @Override
    public Math getMath(int id) {
        return MathMap.get(id);
    }

    @Override
    public List<Math> getAllMath() {
        return new ArrayList<Math>(MathMap.values());
    }

    @Override
    public void createMath(Math math) {
        MathMap.put(math.getId(), math);

    }

    @Override
    public void updateMath(Math math) {
        MathMap.replace(math.getId(), math);

    }

}
