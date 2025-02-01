import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!"); // sout shortcut

        int x = 12;

        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x < 10){
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is equal to 10");
        }

        int j = 4;
        for (int i = 0; i < 10; i++){ // the i will disappear once loop is completed
            System.out.println(i); // stops code and tells me all values when clicking debug
        }

    }
}