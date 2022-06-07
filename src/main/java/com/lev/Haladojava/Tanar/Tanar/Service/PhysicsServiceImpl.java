package com.lev.Haladojava.Tanar.Tanar.Service;

import com.lev.Haladojava.Tanar.Tanar.Model.Physics;
import com.lev.Haladojava.Tanar.Tanar.Persist.PhysicsDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicsServiceImpl implements PhysicsService {

    private final PhysicsDao physicsDao;

    public PhysicsServiceImpl(PhysicsDao physicsDao){
        this.physicsDao = physicsDao;
    }

    @Override
    public List<Physics> listAllPhysics() {
        return physicsDao.getAllPhysics();
    }

    @Override
    public void createNewPhysics(Physics physics) {
        physicsDao.createPhysics(physics);
    }

    @Override
    public void modifyPhysics(Physics physics) {
        physicsDao.updatePhysics(physics);
    }

}
