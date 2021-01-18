package myPROJECTS.duck.ducks;

import myPROJECTS.duck.Duck;
import myPROJECTS.duck.dacksBehaviors.NotFlying;
import myPROJECTS.duck.dacksBehaviors.Scream;
import myPROJECTS.duck.dacksBehaviors.SwimOnSurfaceOnly;

public class RobberDuck extends Duck {

    public RobberDuck(){
        howIFlying = new NotFlying();
        howISwim = new SwimOnSurfaceOnly();
        howIVoice = new Scream();
    }
}
