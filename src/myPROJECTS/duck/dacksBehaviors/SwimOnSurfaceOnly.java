package myPROJECTS.duck.dacksBehaviors;

import myPROJECTS.duck.behaviorInterfaces.Swim;

public class SwimOnSurfaceOnly implements Swim {

    @Override
    public String swim() {
        return "Swimming on surface ONLY !!";
    }
}
