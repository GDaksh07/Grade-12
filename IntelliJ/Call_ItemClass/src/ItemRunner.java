// Name - Daksh
// Date - 12 / 11/ 24
// Purpose - Creates 4 items and prints 3 accessors for each item

public class ItemRunner {
    public static void main(String[] args) {
        // Creates 4 objects
        Item shirt = new Item();
        Item shoe = new Item (50.99, "shoe");
        Item pants = new Item (24.99, "pants");
        Item necklace = new Item (99.85, "necklace");

        // Prints the name, price and toString for the shirt
        System.out.println (shirt.getName());
        System.out.println (shirt.getPrice());
        System.out.println (shirt.toString());

        // Prints the name, price and toString for the shoe
        System.out.println (shoe.getName());
        System.out.println (shoe.getPrice());
        System.out.println (shoe.toString());

        // Prints the name, price and toString for the pants
        System.out.println (pants.getName());
        System.out.println (pants.getPrice());
        System.out.println (pants.toString());

        // Prints the name, price and toString for the necklace
        System.out.println (necklace.getName());
        System.out.println (necklace.getPrice());
        System.out.println (necklace.toString());
    }
}