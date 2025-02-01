// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String name = IO.inputString("Please enter your name: ");
//        System.out.println ("Hello, " + name + "!");


        String greeting = "Its a beautiful day.";
        String response = "Enjoy the simple things in life.";
//        System.out.println (greeting.compareTo(response));
//        System.out.println (response.compareTo(greeting));

//        System.out.println ("Elephant".charAt(0));

//        System.out.println (greeting.equals(response));
//        System.out.println (greeting.concat(" " + response));
//        System.out.println (greeting.length());
//        System.out.println (greeting.replace("Its", "Have"));
        System.out.println (greeting.indexOf(response));
        System.out.println (response.indexOf("Life".toLowerCase()));
    }
}