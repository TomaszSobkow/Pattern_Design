package duck.ducks;

import duck.Duck;
import duck.dacksBehaviors.NotFlying;
import duck.dacksBehaviors.Scream;
import duck.dacksBehaviors.Swimming;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        howIFlying = new NotFlying();
        howISwim = new Swimming();
        howIVoice = new Scream();
    }
}
