package com.lev.Haladojava.Tanar.Tanar.Controller;

import com.lev.Haladojava.Tanar.Tanar.Model.Math;
import com.lev.Haladojava.Tanar.Tanar.Service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MathController {
    private MathService mathService;

    @Autowired
    public MathController(MathService mathService){
        this.mathService = mathService;
    }

    @GetMapping("allMath")
    public List getMatekList(){
        return mathService.listAllMath();
    }

    @PostMapping("CreateMath")
    public String createMath (@RequestBody Math math){
        mathService.createNewMath(math);
        return "ok";
    }
    @PutMapping("UpdateMath")
    public String updateMath( @RequestBody Math math) {
        mathService.modifyMath(math);
        return "ok";
    }
}
