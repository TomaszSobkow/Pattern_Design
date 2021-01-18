package duck.dacksBehaviors;

import duck.behaviorInterfaces.Fly;

public class NotFlying implements Fly {

    @Override
    public String fly() {
        return "I can't fly";
    }
}
