package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Informatics;

import java.util.List;

public interface InformaticsService {
    List listAllInformatics();
    void createNewInformatics(Informatics informatics);
    void modifyInformatics(Informatics informatics);
}
