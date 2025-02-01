public class Assignment1Utility {

    // welcome (void)
    // purpose: prints to the user "Welcome to ICS4U" to the user
    public static void welcome (){
        System.out.println ("Welcome to ICS4U");
    }



    // stringCombiner (String, String) -> String
    // purpose: Uses the StringBuilder to append 2 words. Combining both words into one.
    //          the combined word will be returned
    public static String stringCombiner (String wordOne, String wordTwo){

        // creates the StringBuilder object
        StringBuilder sb = new StringBuilder();

        // appends wordOne
        sb.append (wordOne);

        // appends wordTwo
        sb.append (wordTwo);

        // converts String Builder to string and returns result
        return sb.toString();
    }



    // sumOfMultiples (int, int) -> int
    // purpose: Adds each multiple of the set multiple table, until the multiple number is
    //          1 multiple less than the number. the sum will be returned
    public static int sumOfMultiples (int number, int multiple){

        // sets variables
        int i = 0;
        int sum = 0;

        // i gets the multiple added each time the loop runs until i is greater than the integer (number)
        while (i <= number){
            sum += i;

            // Adds the multiple amount to i to figure out if the multiple is less than the number.
            // Also adds the current number to the sum
            i += multiple;
        }

        // returns the sum
        return sum;
    }



    // nitFibNum (int) -> int
    // took me around 30 minutes
    // purpose: finds out fibonacci number for specific placement.
    //          base of fibonacci numbers are 0 and 1. If a negative number is inputted
    //          the system will return -1 otherwise the fibonacci number for the inputted numbers
    //          placement will be returned
    public static int nthFibNum (int num){

        // checks if the number if negative
        if (num < 0){
            return -1;
        }

        // base values for fibonacci numbers
        // fibonacci number 0 is equal to 0 and fibonacci number 1 is equal to 1
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        // base values of fibonacci numbers
        int first = 0;
        int second = 1;

        // calculates the fibonacci number for the value of num
        int fibonacci = 0;

        // loops i which is 2 as the first 2 base numbers are taken by 0 and 1.
        // adds up numbers for fibonacci and puts the previous number in first and the
        // current number in second if the loop needs to continue to the next fibonacci number
        for (int i = 2; i < num; i++){
            fibonacci = first + second;
            first = second;
            second = fibonacci;
        }

        // returns the fibonacci number
        return fibonacci;
    }



    // longestStringLen (String []) -> String
    // purpose: checks which word in the array is the longest. the word is sent into the loop
    //          which length is greater. the initial longest word is 0 long and the first word
    //          will then become the longest word. loop will continue until all words in the array
    //          are checked. the longest word will be returned
    public static String longestStringLen (String[] words){

        // sets a string for the longest word, initial number of length is 0
        String longestWord = "";

        // checks each word to see which one is the longest
        for (String i : words){

            // finds out if the next word is longer than the length of the previous word
            if (i.length () > longestWord.length()){
                longestWord = i;
            }
        }

        // returns the longestWord
        return longestWord;
    }
}
