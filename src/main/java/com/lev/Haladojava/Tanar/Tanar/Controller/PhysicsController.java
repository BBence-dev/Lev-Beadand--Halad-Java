package com.lev.Haladojava.Tanar.Tanar.Controller;

import com.lev.Haladojava.Tanar.Tanar.Model.Physics;
import com.lev.Haladojava.Tanar.Tanar.Service.PhysicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhysicsController {

    private PhysicsService physicsService;

    @Autowired
    public PhysicsController(PhysicsService physicsService){
        this.physicsService = physicsService;
    }

    @GetMapping("allPhysics")
    public List getPhysicsList(){
        return physicsService.listAllPhysics();
    }

    @PostMapping("CreatePhysics")
    public String createPhysics (@RequestBody Physics physics){
        physicsService.createNewPhysics(physics);
        return "ok";
    }
    @PutMapping("UpdatePhysics")
    public String updatePhysics( @RequestBody Physics physics) {
        physicsService.modifyPhysics(physics);
        return "ok";
    }

}
