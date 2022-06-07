package com.lev.Haladojava.Tanar.Tanar.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Physics {
    @NotNull
    private int id;
    @NotBlank
    private String name;
    @Min(22)
    @Max(40)
    private int lesson;
    @Min(0)
    @Max(10)
    private int Classroom;

}
