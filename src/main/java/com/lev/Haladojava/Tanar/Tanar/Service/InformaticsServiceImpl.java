package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Informatics;
import com.lev.Haladojava.Tanar.Tanar.Persist.InformaticsDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformaticsServiceImpl implements InformaticsService {

    private final InformaticsDao informaticsDao;

    public InformaticsServiceImpl(InformaticsDao informaticsDao){
        this.informaticsDao = informaticsDao;
    }

    @Override
    public List listAllInformatics() {
        return informaticsDao.getAllInformatics();
    }

    @Override
    public void createNewInformatics(Informatics informatics) {
        informaticsDao.createInformatics(informatics);
    }

    @Override
    public void modifyInformatics(Informatics informatics) {
        informaticsDao.updateInformatics(informatics);
    }

}
