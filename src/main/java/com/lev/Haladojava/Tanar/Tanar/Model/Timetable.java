package com.lev.Haladojava.Tanar.Tanar.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Timetable {
    @NotNull
    private int id;
    @NotNull
    private String timetable;
    @NotNull
    private int physicsID;
    @NotNull
    private int physicsLesson;
    @NotNull
    private int informaticsID;
    @NotNull
    private int informaticsLesson;
    @NotNull
    private int chemistryID;
    @NotNull
    private int chemistryLesson;
    @NotNull
    private int mathID;
    @NotNull
    private int mathLesson;
    @NotNull
    @Min(20)
    @Max(30)
    private int fullboard;

}
