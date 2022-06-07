package com.lev.Haladojava.Tanar.Tanar.Controller;

import com.lev.Haladojava.Tanar.Tanar.Model.Chemistry;
import com.lev.Haladojava.Tanar.Tanar.Service.ChemistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChemistryController {

    private ChemistryService chemistryService;

    @Autowired
    public ChemistryController(ChemistryService chemistryService){
        this.chemistryService = chemistryService;
    }

    @GetMapping("allChemistry")
    public List getChemistryList(){
        return chemistryService.listAllChemistry();
    }

    @PostMapping("CreateChemistry")
    public String createChemistry (@RequestBody Chemistry chemistry){
        chemistryService.createNewChemistry(chemistry);
        return "ok";
    }
    @PutMapping("UpdateChemistry")
    public String updateChemistry( @RequestBody Chemistry chemistry) {
        chemistryService.modifyChemistry(chemistry);
        return "ok";
    }
}
