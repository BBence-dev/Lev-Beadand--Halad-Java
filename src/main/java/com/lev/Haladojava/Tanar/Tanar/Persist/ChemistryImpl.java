package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Chemistry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ChemistryImpl implements ChemistryDao {

    private Map<Integer, Chemistry> ChemistryMap;

    public ChemistryImpl(){
        ChemistryMap = new HashMap<>();
        ChemistryMap.put(1,new Chemistry(1,"Lajos",27,31));
    }
    @Override
    public Chemistry getChemistry(int id) {
        return ChemistryMap.get(id);
    }

    @Override
    public List<Chemistry> getAllChemistry() {
        return new ArrayList<Chemistry>(ChemistryMap.values());
    }

    @Override
    public void createChemistry(Chemistry chemistry) {
        ChemistryMap.put(chemistry.getId(),chemistry);
    }

    @Override
    public void updateChemistry(Chemistry chemistry) {
        ChemistryMap.replace(chemistry.getId(),chemistry);
    }

}
