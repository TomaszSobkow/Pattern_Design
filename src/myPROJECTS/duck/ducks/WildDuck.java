package myPROJECTS.duck.ducks;

import myPROJECTS.duck.Duck;
import myPROJECTS.duck.dacksBehaviors.FlyNormaly;
import myPROJECTS.duck.dacksBehaviors.Scream;
import myPROJECTS.duck.dacksBehaviors.Swimming;

public class WildDuck extends Duck {

    public WildDuck(){
        howIFlying = new FlyNormaly();
        howISwim = new Swimming();
        howIVoice = new Scream();
    }
}
