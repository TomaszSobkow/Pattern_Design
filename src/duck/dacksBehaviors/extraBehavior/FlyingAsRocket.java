package duck.dacksBehaviors.extraBehavior;

import duck.behaviorInterfaces.Fly;

public class FlyingAsRocket implements Fly {
    @Override
    public String fly() {
        return "Flying with the Rocket";
    }
}
