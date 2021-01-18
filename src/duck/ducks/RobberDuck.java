package duck.ducks;

import duck.Duck;
import duck.dacksBehaviors.NotFlying;
import duck.dacksBehaviors.Scream;
import duck.dacksBehaviors.SwimOnSurfaceOnly;

public class RobberDuck extends Duck {

    public RobberDuck(){
        howIFlying = new NotFlying();
        howISwim = new SwimOnSurfaceOnly();
        howIVoice = new Scream();
    }
}
