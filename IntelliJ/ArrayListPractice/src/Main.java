// Name - Daksh Gulati
// Date - 18/11/24
// Purpose - Creates a random list of a certain amount of numbers and prints it forwards and backwards
//           then prints the list in ascending and descending order, then prints the mean, median and mode

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // adds random numbers to the arr ArrayList from the list method
        int listSize = 25;
        ArrayList<Integer> arr = list(listSize);

        // Prints the original list
        System.out.println ("The original list is: ");
        for (int i = 0; i < listSize; i++){
            int num = arr.get(i);
            System.out.print (num + " ");
        }

        // Buffer Line
        System.out.println (" ");

        // Prints the original list backwards
        System.out.println ("\nThe original list backwards is:");
        for (int i = listSize - 1; -1 < i; i--){
            int num = arr.get(i);
            System.out.print (num + " ");
        }

        // Sorts array into ascending order inside the method (and calls the method)
        ArrayList<Integer> arrSort = sort(listSize, arr);

        // Buffer Line
        System.out.println (" ");

        // Prints in ascending order
        System.out.println ("\nThe original list in ascending order is: ");
        for (int i = 0; i < listSize; i++){
            int num = arrSort.get(i);
            System.out.print (num + " ");
        }

        // Buffer Line
        System.out.println (" ");

        // Prints in descending order
        System.out.println ("\nThe original list in descending order is: ");
        for (int i = listSize - 1; i > -1; i--){
            int num = arrSort.get(i);
            System.out.print (num + " ");
        }

        // Buffer Line
        System.out.println (" ");

        // Mean
        int sumMean = mean(arrSort, listSize);
        System.out.println("\nThe mean of the list is " + sumMean / listSize);

        // Median
        int middle = median(arrSort, listSize);
        System.out.println ("\nThe median of the list is " + middle);

        // Mode
        ArrayList<Integer> most = mode (arrSort, listSize);
        System.out.println ("\nThe mode(s) of this list is: " + most);
    }

    // Purpose: creates a ArrayList of a certain amount of random numbers
    // list (int) -> ArrayList<Integer>
    public static ArrayList<Integer> list (int size){
        // Creates an empty list
        ArrayList<Integer> arrRand = new ArrayList<Integer>();

        // Initializes variables
        int min = 1;
        int max = 100;

        // Adds random numbers to the list
        for (int i = 0; i < size; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            arrRand.add (randomNum);
        }

        return arrRand;
    }

    // Purpose: Sorts all the random numbers in ascending order
    // sort (int, ArrayList<Integer> -> ArrayList<Integer>
    public static ArrayList<Integer> sort (int size, ArrayList<Integer> arr){
        // Sorts array into ascending order
        for (int i = 0; i < size; i++){

            // Finds the minimum number in the unsorted array
            int minIndex = i;

            for (int j = i + 1; j < size; j++){
                if (arr.get(j) < arr.get(minIndex)){
                    minIndex = j;
                }
            }

            // Swaps the found minimum number with the first number
            int temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }

        return arr;
    }

    // Purpose: Calculates the mean of the ArrayList
    // mean (ArrayList<Integer>, int) -> int
    public static int mean (ArrayList<Integer> arr, int size){
        // Calculates the mean of all integers in the random Array List
        int sum = 0;

        // adds each value of the ArrayList and returns it
        for (int i = 0; i < size; i++){
            sum += arr.get(i);
        }

        return sum;
    }

    // Purpose: Finds the median of the ArrayList
    // median (ArrayList<Integer>, int) -> int
    public static int median (ArrayList<Integer> arr, int size){
        // Finds the remainder to determine what the middle value of the list would be
        int medIndex = size / 2;
        int median;

        // If even number of numbers
        if (size % 2 == 0){
            median = (arr.get(medIndex - 1) + arr.get(medIndex)) / 2;
        } else {
            median = arr.get(medIndex);
        }

        return median;
    }

    // Purpose:
    // mode (ArrayList<Integer>, int) -> ArrayList<Integer>
    public static ArrayList<Integer> mode (ArrayList<Integer> arr, int size){
        ArrayList <Integer> modeList = new ArrayList<>();
        int maxCount = 0;

        for (int i = 0; i < size; i++){
            int count = 0;

            // Checks what numbers have a higher count
            for (int j = 0; j < size; j++){
                if (arr.get(j).equals(arr.get(i))){
                    count++;
                }
            }

            // Checks if the count is greater than the maxCount, if so the maxCount number will change
            // If the count is equal to the maxCount number then it adds it to another ArrayList and returns all numbers that are the mode
            if (count > maxCount){
                maxCount = count;
                modeList.clear();
                modeList.add(arr.get(i));
            } else if (count == maxCount && !modeList.contains(arr.get(i))){
                modeList.add(arr.get(i));
            }
        }

        return modeList;
    }
}