package duck.ducks;

import duck.Duck;
import duck.dacksBehaviors.FlyNormaly;
import duck.dacksBehaviors.Scream;
import duck.dacksBehaviors.Swimming;

public class WildDuck extends Duck {

    public WildDuck(){
        howIFlying = new FlyNormaly();
        howISwim = new Swimming();
        howIVoice = new Scream();
    }
}
