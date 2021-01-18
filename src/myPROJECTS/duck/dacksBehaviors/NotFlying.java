package myPROJECTS.duck.dacksBehaviors;

import myPROJECTS.duck.behaviorInterfaces.Fly;

public class NotFlying implements Fly {

    @Override
    public String fly() {
        return "I can't fly";
    }
}
