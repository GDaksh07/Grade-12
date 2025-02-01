/*
Name: Daksh Gulati
Date: 5/9/24
File Name: dakshGulatiAssignment0
*/

public class Main {

    public static void main (String [] args) {

        // performs the shippingCost method
        double cost = PracticeUtility.shippingCost(27);

        // Displays to the user how much the shipping cost would be
        System.out.println("The shipping cost of your package is " + cost);

        // performs the amount method
        double tax = PracticeUtility.amount (60000);

        // Displays how much the user would have to pay each year
        System.out.println ("The amount of tax you would pay each year would be $" + String.format ("%.2f",tax));

        // performs the isPalindrome method
        boolean result = PracticeUtility.isPalindrome("moon");

        // outputs the result if the word is a palindrome
        System.out.println ("The word is a palindrome? - " + result);

        // initialize the variable and array
        int[] numbers = new int[]{10,13,15,18,19};

        // evenOdd method
        int output = PracticeUtility.evenOdd (numbers);

        // outputs the result of the difference between even and odd numbers
        System.out.println ("The difference between your even and odd numbers is " + output);
    }
}