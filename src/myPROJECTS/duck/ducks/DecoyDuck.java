package myPROJECTS.duck.ducks;

import myPROJECTS.duck.Duck;
import myPROJECTS.duck.dacksBehaviors.NotFlying;
import myPROJECTS.duck.dacksBehaviors.Scream;
import myPROJECTS.duck.dacksBehaviors.Swimming;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        howIFlying = new NotFlying();
        howISwim = new Swimming();
        howIVoice = new Scream();
    }
}
