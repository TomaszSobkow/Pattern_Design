package myPROJECTS.duck.dacksBehaviors;

import myPROJECTS.duck.behaviorInterfaces.Fly;

public class FlyNormaly implements Fly {

    @Override
    public String fly() {
        return "Flying normal";
    }
}
