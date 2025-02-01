public class CircleRunner {
    public static void main(String[] args) {
        // Creates 3 circles
        Circle circ1 = new Circle ();
        Circle circ2 = new Circle (10);
        Circle circ3 = new Circle ();

        // toString print statement
        System.out.println (circ3.toString());

        // Changes the radius of circ3
        circ3.setRadius (2);

        // Prints the
        System.out.println ("The radius of circle one is " + circ1.getRadius());
        System.out.println ("The radius of circle two is " + circ2.getRadius());
        System.out.println ("The radius of circle Three is " + circ3.getRadius());

        System.out.println(" ");

        // compares circ1 to circ2
        if (circ1.compareTo(circ2) == 0){
            System.out.println("Circle one and circle two are the same circles");
        }

        // tells user if circ1 equals to circ3 to see if they are same circle
        if (circ1.equals(circ3)){
            System.out.println("Circle 1 and 3 are the same circle");
        }

        System.out.println(" ");

        // calculates area for all circles and outputs it to the user
        double area1 = circ1.area();
        double area2 = circ2.area();
        double area3 = circ3.area();
        System.out.println("The area of circle 1 is " + String.format("%.2f", area1));
        System.out.println("The area of circle 2 is " + String.format("%.2f", area2));
        System.out.println("The area of circle 3 is " + String.format("%.2f", area3));

        System.out.println(" ");

        // calculates circumference for all circles and outputs it to the user
        double circumference1 = circ1.perimeter();
        double circumference2 = circ2.perimeter();
        double circumference3 = circ3.perimeter();
        System.out.println("The circumference of circle 1 is " + String.format("%.2f", circumference1));
        System.out.println("The circumference of circle 2 is " + String.format("%.2f", circumference2));
        System.out.println("The circumference of circle 3 is " + String.format("%.2f", circumference3));

        System.out.println(" ");

        // calculates diameter for all circles and outputs it to the user
        double diameter1 = circ1.diameter();
        double diameter2 = circ2.diameter();
        double diameter3 = circ3.diameter();
        System.out.println("The diameter of circle 1 is " + diameter1);
        System.out.println("The diameter of circle 2 is " + diameter2);
        System.out.println("The diameter of circle 3 is " + diameter3);

        System.out.println(" ");

        // calculates volume for all circles and outputs it to the user
        double volume1 = circ1.volume();
        double volume2 = circ2.volume();
        double volume3 = circ3.volume();
        System.out.println("The volume of circle 1 is " + String.format("%.2f", volume1));
        System.out.println("The volume of circle 2 is " + String.format("%.2f", volume2));
        System.out.println("The volume of circle 3 is " + String.format("%.2f", volume3));

    }
}