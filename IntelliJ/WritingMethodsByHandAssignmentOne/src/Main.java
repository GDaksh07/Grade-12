// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String longestWord (String wordOne, String wordTwo) {

        // set variables
        int startOne = 0;
        int endOne = wordOne.length()-1;
        int startTwo = 0;
        int endTwo = wordTwo.length()-1;
        int charOne = 0;
        int charTwo = 0;

        while (startOne < endOne) {

            charOne += 1;
            startOne ++;
        }

        while (startTwo < endTwo) {

            charTwo += 1;
            startTwo ++;
        }

        if (charOne < charTwo) {
            return wordTwo;
        } else if (charOne > charTwo) {
            return wordOne;
        } else {
        return "equal";
        }

    }
    public static void main(String[] args) {

        String wordOne = "One";
        String wordTwo = "seven";

        String longest = longestWord(wordOne, wordTwo);

        System.out.println (longest);
        }
    }