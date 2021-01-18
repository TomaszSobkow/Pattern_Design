package duck;

import duck.behaviorInterfaces.Fly;
import duck.behaviorInterfaces.Swim;
import duck.behaviorInterfaces.Voice;

public  class Duck {

    protected Fly howIFlying;
    protected Swim howISwim;
    protected Voice howIVoice;


    public String displayDuck(){
        return getClass().toString().substring(getClass().toString().lastIndexOf('.')+1);
    }

    public void fly(){
        howIFlying.fly();
    }
    public void voice(){
        howIVoice.voice();
    }
    public void swimming(){
        howISwim.swim();
    }

    public void setFlyingMethod(Fly fly){ howIFlying = fly; }
    public void setVoice(Voice vi){ howIVoice = vi; }
    public void setSwimming(Swim sw){ howISwim = sw; }

}
