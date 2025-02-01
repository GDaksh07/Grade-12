import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String [] args) {

        // Class Examples
        // object withing the instance of a class
        // c1 has no access to c2
        Animal a1 = new Animal (10, "Black", "Large", 25, "Felix", "Cat");
        Animal a2 = new Animal (5, "Orange", "Small", 12, "Bob", "Cat");

        Animal a3 = new Animal ("Jerry", "Cat");
        // private will not allow this to change the type
        // a3.type = "elephant";

        Animal a4 = new Animal ("Tom", "Mouse");


        // random variables for debugging
        int x = 6;
        float y = 70.4f;

        // prints specific parts of the class
        System.out.println (a1.getAge());

        a1.setName ("Billy");


        a1.birthday();
        a1.birthday();
        a1.birthday();
        a1.birthday();

        System.out.println (a2.getWeight());
        a1.eat("pizza");
        a1.eat("pizza");
        a1.eat("pizza");
        System.out.println (a2.getWeight());

        System.out.println (a1.getAge());

        a1.talk();
        a2.talk();

        System.out.println (a1);
        System.out.println(a2);

        String str = "Hello";
        String str2 = "wasdwasd";
        str.equals (str2);

        if (a1.equals(a1)){
            System.out.println ("Those are the same cat");
        }

        if (a1.compareTo(a2) == 1){
                System.out.println(a1.getName() + " is older than " + a2.getName());
        }

        // prints type of c1 if its public
        // System.out.println (c1.type);


        // String Builder
//        StringBuilder mySb = new StringBuilder();
//        StringBuilder myNonEmptySb = new StringBuilder("I have meaning, I am not empty");
//
//        System.out.println (mySb);
//        System.out.println (myNonEmptySb);


        // My Example
        Car porsche911 = new Car ("Porsche", "911 Carrera 4 GTS", 2);
        Car koenigseggJesko = new Car (2, "RWD", 2);

        porsche911.suv();
        koenigseggJesko.awd();
        koenigseggJesko.displayWindows();


        // GameState
        GameState i = new GameState (20, 20, 20);
//        GameState.percentComplete();


//        System.out.println(Car.toString());
        Car porsche918 = new Car ("Porsche", "918 Spyder", 2);

        ArrayList<Car> cars = new ArrayList<Car> (Arrays.asList(porsche911, porsche918));
        System.out.println (porsche911.sumDoors(cars));
    }
}