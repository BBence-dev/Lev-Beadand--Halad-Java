package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Physics;

import java.util.List;

public interface PhysicsService {
    List<Physics> listAllPhysics();
    void createNewPhysics(Physics physics);
    void modifyPhysics(Physics physics);
}
