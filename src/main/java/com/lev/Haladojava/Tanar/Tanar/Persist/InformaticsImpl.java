package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Informatics;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class InformaticsImpl implements InformaticsDao {

    private Map<Integer, Informatics>InformaticsMap;

    public InformaticsImpl(){
        InformaticsMap=new HashMap<>();
        InformaticsMap.put(1,new Informatics(1,"Bence",24,12));
    }
    @Override
    public Informatics getInformatics(int id) {
        return InformaticsMap.get(id);
    }

    @Override
    public List<Informatics> getAllInformatics() {
        return new ArrayList<Informatics>(InformaticsMap.values());
    }

    @Override
    public void createInformatics(Informatics informatics) {
        InformaticsMap.put(informatics.getId(), informatics);
    }

    @Override
    public void updateInformatics(Informatics informatics) {
        InformaticsMap.replace(informatics.getId(), informatics);
    }

}
