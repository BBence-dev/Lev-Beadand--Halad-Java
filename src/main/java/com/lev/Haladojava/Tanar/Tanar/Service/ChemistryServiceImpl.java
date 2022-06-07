package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Chemistry;
import com.lev.Haladojava.Tanar.Tanar.Persist.ChemistryDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemistryServiceImpl implements ChemistryService {

    private ChemistryDao chemistryDao;

    public ChemistryServiceImpl(ChemistryDao chemistryDao){
        this.chemistryDao = chemistryDao;
    }

    @Override
    public List listAllChemistry() {
        return chemistryDao.getAllChemistry();
    }

    @Override
    public void createNewChemistry(Chemistry chemistry) {
        chemistryDao.createChemistry(chemistry);
    }

    @Override
    public void modifyChemistry(Chemistry chemistry) {
        chemistryDao.updateChemistry(chemistry);
    }

}
