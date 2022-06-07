package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Chemistry;

import java.util.List;

public interface ChemistryService {
    List listAllChemistry();
    void createNewChemistry(Chemistry chemistry);
    void modifyChemistry(Chemistry chemistry);
}
