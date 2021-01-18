package duck.dacksBehaviors;

import duck.behaviorInterfaces.Swim;

public class SwimOnSurfaceOnly implements Swim {

    @Override
    public String swim() {
        return "Swimming on surface ONLY !!";
    }
}
