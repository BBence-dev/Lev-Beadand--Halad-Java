package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Physics;

import java.util.List;

public interface PhysicsDao {
    Physics getPhysics(int id);
    void createPhysics(Physics physics);
    void updatePhysics(Physics physics);

    List<Physics> getAllPhysics();

}
