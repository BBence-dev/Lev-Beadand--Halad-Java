package com.lev.Haladojava.Tanar.Tanar.Persist;

import com.lev.Haladojava.Tanar.Tanar.Model.Physics;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PhysicsImpl implements PhysicsDao {

    private Map<Integer, Physics> PhysicsMap;

    public PhysicsImpl(){
        PhysicsMap=new HashMap<>();
        PhysicsMap.put(1,new Physics(1,"Anna",23,1));
    }
    @Override
    public Physics getPhysics(int id){
        return PhysicsMap.get(id);
    }
    @Override
    public List<Physics> getAllPhysics() {
        return new ArrayList<Physics>(PhysicsMap.values());
    }
    @Override
    public void createPhysics(Physics physics) {
        PhysicsMap.put(physics.getId(), physics);
    }

    @Override
    public void updatePhysics(Physics physics) {
        PhysicsMap.replace(physics.getId(), physics);
    }

}
