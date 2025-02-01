public class Main {
    static public long recursion (int n){
        if (n == 0 || n == 1)
            return 1;

        // recursive process
        return n * recursion (n-1);
    }

    public static void main(String[] args) {
//        String name = IO.inputString("Please enter your name: ");
//        System.out.println("Hello, " + name + "!");

        int num = IO.inputInt("Enter a integer for a factorial calculation: ");
        long result = 1;

//        // for loop
//        for (int i = 1; i <= num; i++){
//            result *= i;
//        }

        // recursive call
        result = recursion(num);

        System.out.println("The factorial of " + num + " is " + result);


    }
}