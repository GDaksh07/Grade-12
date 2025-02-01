//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // welcome method
        Assignment1Utility.welcome();



        // sets variables for stringCombiner method
        String wordOne = "Hello, ";
        String wordTwo = "world";

        // stringCombiner method
        String combinedWord = Assignment1Utility.stringCombiner(wordOne, wordTwo);

        // outputs the result
        System.out.println(combinedWord);



        // sets variables for multipleSum method
        int number = 10;
        int multiple = 3;

        // multipleSum method
        int multipleSum = Assignment1Utility.sumOfMultiples(number, multiple);

        // outputs the multipleSum
        System.out.println (multipleSum);



        // sets variable for nthFibNum method
        int num = 10;

        // nthFibNum method
        int fib = Assignment1Utility.nthFibNum (num);

        // outputs result to user
        System.out.println(fib);



        // sets array for longestStringLen method
        String [] words = new String []{"hello", "moon", "pop", "giraffe"};

        // longestStringLen method
        String longestWord = Assignment1Utility.longestStringLen (words);

        // outputs result to user
        System.out.println (longestWord);
    }
}