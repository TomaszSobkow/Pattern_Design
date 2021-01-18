package myPROJECTS.duck;

import myPROJECTS.duck.dacksBehaviors.FlyNormaly;
import myPROJECTS.duck.dacksBehaviors.NotFlying;
import myPROJECTS.duck.dacksBehaviors.extraBehavior.FlyingAsRocket;
import myPROJECTS.duck.ducks.DecoyDuck;
import myPROJECTS.duck.ducks.RobberDuck;
import myPROJECTS.duck.ducks.WildDuck;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Duck> ducksInArray = new ArrayList<>();

    public static void main(String[] args) {
       addDuckToArray();
       printAllDacks();

    }

    private static void addDuckToArray(){
        Duck duck1 = new DecoyDuck();
      duck1.setFlyingMethod(new FlyingAsRocket());
        Duck duck2 = new RobberDuck();
        duck2.setFlyingMethod(new FlyingAsRocket());

        Duck duck3 = new WildDuck();

        ducksInArray.add(duck1);
        ducksInArray.add(duck2);
        ducksInArray.add(duck3);
    }

     public static void printAllDacks(){
        String exception = "";
        StringBuilder getClassStringBuilder = new StringBuilder();
         System.out.printf("%-15s %-25s %-30s %-25s ","<NAME>","<Flying Method>","<Swimming>","<Voice>");
         System.out.println("\n-----------------------------------------------------------------------------------");

         for (Duck d : ducksInArray ) {

                     if(d.howIFlying.fly().equals (new FlyNormaly().fly()) ||
                             (d.howIFlying.fly().equals(new NotFlying().fly()))){

                     }else {
                         exception = "Super Natural behavior detected in ";
                             getClassStringBuilder.append(d.getClass().toString().
                                     substring(d.getClass().toString().lastIndexOf('.') + 1)).append(", ");
                     }

             System.out.printf("%-15s %-25s %-30s %-25s ",
                     d.displayDuck(),
                     d.howIFlying.fly(),
                     d.howISwim.swim(),
                     d.howIVoice.voice());
             System.out.println();
         }

         if(exception.isEmpty()){}
         else {
             System.err.println("\n"+exception+" "+getClassStringBuilder.substring(0,getClassStringBuilder.toString().lastIndexOf(',')));
         }

         System.out.println("\nNo of Ducks: "+ ducksInArray.size());
    }
}
