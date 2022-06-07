package com.lev.Haladojava.Tanar.Tanar.Controller;



import com.lev.Haladojava.Tanar.Tanar.Model.Informatics;
import com.lev.Haladojava.Tanar.Tanar.Service.InformaticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InformaticsController {
    private InformaticsService informaticsService;

    @Autowired
    public InformaticsController(InformaticsService informaticsService){
        this.informaticsService = informaticsService;
    }

    @GetMapping("allInformatics")
    public List getInformaticsList(){
        return informaticsService.listAllInformatics();
    }

    @PostMapping("CreateInformatics")
    public String createInformatics (@RequestBody Informatics informatics){
        informaticsService.createNewInformatics(informatics);
        return "ok";
    }
    @PutMapping("UpdateInformatics")
    public String updateInformatics( @RequestBody Informatics informatics) {
        informaticsService.modifyInformatics(informatics);
        return "ok";
    }
}
