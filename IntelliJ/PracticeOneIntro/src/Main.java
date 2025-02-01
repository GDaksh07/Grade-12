/*
Name: Daksh Gulati
Date: 10/9/24
File Name: dakshGulatiPracticeOne
Purpose: The purpose of this program is to check if the number x is more or less than 10,
         if the number x is a multiple of 3 and if the number x is a prime number
*/
public class Main {
    public static void main(String[] args) {

        // sets variable x to 15
        int x = 3;

        // calls the greaterThanLessThan method
        greaterThanLessThan (x);

        // calls the multipleOfThree method
        multipleOfThree (x);

        // calls the primeNumber method
        primeNumber (x);
    }

    // Creates the greaterThanLessThan method
    public static void greaterThanLessThan (int x){
        // checks if x is greater or less than 10
        if (x > 10){
            System.out.println("x is greater than 10");
        } else if (x < 10){
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is equal to 10");
        }
    }

    // Creates the multipleOfThree method
    public static void multipleOfThree (int x){

        // sets variable and finds remainder of x
        int result = x % 3;

        // checks if the remainder (result) is 0 if so then the number is a multiple of 3
        if (result == 0) {
            System.out.println("x is a multiple of 3");
        } else {
            System.out.println("x is not a multiple of 3");
        }
    }

    // Creates the primeNumber method
    public static void primeNumber (int x){

        // makes variables
        boolean prime = true;

        // checks if number is prime
        // if the remainder is 0 then the number is not prime
        int i = 2;
        while (i < x){
            if(x % i == 0){
                prime = false;
            }
            i++;
        }

        // tells the user if their number is prime or not
        if (prime == true){
            System.out.println("x is a prime number");
        } else {
            System.out.println("x is not a prime number");
        }
    }
}