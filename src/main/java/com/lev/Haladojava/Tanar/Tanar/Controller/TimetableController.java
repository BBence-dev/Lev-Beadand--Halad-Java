package com.lev.Haladojava.Tanar.Tanar.Controller;

import com.lev.Haladojava.Tanar.Tanar.Model.Timetable;
import com.lev.Haladojava.Tanar.Tanar.Service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimetableController {

    private TimetableService timetableService;

    @Autowired
    public TimetableController(TimetableService timetableService){
        this.timetableService = timetableService;
    }
    @GetMapping("/allTimetable")
    public List getTimetable(){
        return timetableService.listAllTimetable();
    }
    @GetMapping ("/getOneTimetable")
        public Timetable getOneTimetable(@RequestParam("id") int id){
            return timetableService.getOneTimetable(id);

    }

    @PutMapping("/CreateTimetableAll")
    @ResponseBody
    public String createTimetableAll (@RequestParam("id") int id,
                                    @RequestParam("timetable")String timetable,
                                    @RequestParam("physicsID") int physicsID,
                                    @RequestParam("physicsLesson") int physicsLesson,
                                    @RequestParam("informaticsID") int informaticsID,
                                    @RequestParam("informaticsLesson") int informaticsLesson,
                                    @RequestParam("chemistryID") int chemistryID,
                                    @RequestParam("chemistryLesson") int chemistryLesson,
                                    @RequestParam("mathID") int mathID,
                                    @RequestParam("mathLesson") int mathLesson,
                                    @RequestParam("fullboard") int fullboard


    ){
        timetableService.createTimetable(new Timetable(id,
                timetable,
                physicsID,
                physicsLesson,
                informaticsID,
                informaticsLesson,
                chemistryID,
                chemistryLesson,
                mathID,
                mathLesson,
                fullboard

        ));
        return "ok";
    }
    @GetMapping("createTimetableMath")
    public String createTimetableMath(@RequestParam("id") int id,
                                      @RequestParam("timetable") String timetable,
                                      @RequestParam("mathID") int mathID,
                                      @RequestParam("mathLesson") int mathLesson,
                                      @RequestParam("fullboard") int fullboard

    ){
        timetableService.createTimetable(new Timetable(id,
                timetable,
                0,
                0,
                0,
                0,
                0,
                0,
                mathID,
                mathLesson,
                fullboard
        ));
        return "ok";
    }
    @GetMapping("createTimetablePhysics")
    public String createTimetablePhysics(@RequestParam("id") int id,
                                      @RequestParam("timetable") String timetable,
                                      @RequestParam("physicsID") int physicsID,
                                      @RequestParam("physicsLesson") int physicsLesson,
                                      @RequestParam("fullboard") int fullboard

    ){
        timetableService.createTimetable(new Timetable(id,
                timetable,
                physicsID,
                physicsLesson,
                0,
                0,
                0,
                0,
                0,
                0,
                fullboard
        ));
        return "ok";
    }
    @GetMapping("createTimetableInformatics")
    public String createTimetableInformatics(@RequestParam("id") int id,
                                      @RequestParam("timetable") String timetable,
                                      @RequestParam("informaticsID") int informaticsID,
                                      @RequestParam("informaticsLesson") int informaticsLesson,
                                      @RequestParam("fullboard") int fullboard

    ){
        timetableService.createTimetable(new Timetable(id,
                timetable,
                0,
                0,
                informaticsID,
                informaticsLesson,
                0,
                0,
                0,
                0,
                fullboard
        ));
        return "ok";
    }
    @GetMapping("createTimetableChemistry")
    public String createTimetableChemistry(@RequestParam("id") int id,
                                      @RequestParam("timetable") String timetable,
                                      @RequestParam("chemistryID") int chemistryID,
                                      @RequestParam("chemistryLesson") int chemistryLesson,
                                      @RequestParam("fullboard") int fullboard

    ){
        timetableService.createTimetable(new Timetable(id,
                timetable,
                0,
                0,
                0,
                0,
                chemistryID,
                chemistryLesson,
                0,
                0,
                fullboard
        ));
        return "ok";
    }
    @PutMapping("UpdateTimetable")
    public String updateTimetable( @RequestBody Timetable timetable) {
        timetableService.modifyTimetable(timetable);
        return "ok";
    }
}
