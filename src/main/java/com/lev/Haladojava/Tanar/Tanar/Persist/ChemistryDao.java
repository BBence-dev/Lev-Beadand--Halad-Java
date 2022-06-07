package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Chemistry;

import java.util.List;

public interface ChemistryDao {
    Chemistry getChemistry(int id);
    List<Chemistry> getAllChemistry();
    void createChemistry(Chemistry chemistry);
    void updateChemistry(Chemistry chemistry);
}
