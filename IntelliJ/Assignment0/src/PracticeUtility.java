public class PracticeUtility {

    // shippingCost (int) -> (double)
    // purpose: find shipping cost depending on weight
    public static double shippingCost (int weight){

        // set variables
        double rate = 0.10;
        int extraCharge = 0;

        // verifies extra cost for weight
        if (weight >= 100) {
            extraCharge = 30;
        } else if (weight >= 50){
            extraCharge = 15;
        } else if (weight >= 25) {
            extraCharge = 10;
        }

        // calculates shipping cost
        double cost = (weight*rate) + extraCharge;

        return cost;
    }

    // amount (double) -> (double)
    // purpose: finds taxable amount
    public static double amount (double income) {

        // Sets varible for taxable amount
        double taxAmount = 0;

        // Calculates tax
        if (income > 70000) {
            taxAmount += (income - 70000) * 0.35;
            income = 70000;
        } if (income > 40000) {
            taxAmount += (income - 40000) * 0.25;
            income = 40000;
        } if (income > 20000) {
            taxAmount += (income - 20000) * 0.15;
            income = 20000;
        } if (income > 10000) {
            taxAmount += (income - 10000) * 0.1;
        }

        // returns the tax amount
        return taxAmount;
    }

    // isPalindrome (String) -> (boolean)
    // function to check if string is a palindrome
    public static boolean isPalindrome(String checkWord)
    {
        // varaible index of first and last elements of string
        int start = 0;
        int end = checkWord.length() - 1;

        // checking loop if index matches both ends of the string
        while (start < end) {
            if (checkWord.charAt(start) != checkWord.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        // returns the boolean value
        return true;
    }

    // evenOdd (int) -> (int)
    // purpose: The method puts the arrays in separate array for even and odd numbers respectably
    //          then calculates the sum of all even and all odd numbers in different variables
    //          then finds the difference between the two
    public static int evenOdd (int [] numbers) {
        // initialize the arrays
        int [] even = new int [numbers.length];
        int [] odd = new int [numbers.length];

        // initialize array index
        int evenIndex = 0;
        int oddIndex = 0;

        // puts even / odd numbers into separate arrays
        for (int j :numbers) {
            if (j % 2 == 0) {
                even [evenIndex] = j; // puts even number into even array
                evenIndex++;
            } else {
                odd [oddIndex] = j;
                oddIndex++;
            }
        }

        // variable to hold sums
        int sumEven = 0;
        int sumOdd = 0;

        // adds the numbers in separate arrays
        for (int k:even) {
            sumEven += k;
        }

        for (int l:odd) {
            sumOdd += l;
        }

        // calculates the difference between even and odd numbers
        int difference = sumEven - sumOdd;

        // returns value
        return difference;
    }

}
