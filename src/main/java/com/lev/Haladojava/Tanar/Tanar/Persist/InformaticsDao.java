package com.lev.Haladojava.Tanar.Tanar.Persist;


import com.lev.Haladojava.Tanar.Tanar.Model.Informatics;

import java.util.List;

public interface InformaticsDao {
    Informatics getInformatics(int id);
    List<Informatics> getAllInformatics();
    void createInformatics(Informatics informatics);
    void updateInformatics(Informatics informatics);
}
