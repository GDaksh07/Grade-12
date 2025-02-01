// It is done in this order
public class Animal {
    // Initialize Attributes (Variables)
    // private makes it so only this class can access this values but not other classes
    private int age;
    private String colour;
    private String size;
    private int weight;
    private String name;
    private String type;

    // Constructors
    public Animal (int age, String colour, String size, int weight, String name, String type) {
        this.age = age;
        this.colour = colour;
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.type = type;
    }

    // Same name but method signature (Parameters) have to be different
    public Animal (String name, String type) {
        this.age = 0;
        this.colour = "Brown";
        this.size = "Tiny";
        this.weight = 7;
        this.name = name;
        this.type = type;
    }

    // Here are my getters and setters
    // Allows access of attributes from private to allow to be sent to other tabs / methods
    // getters
    public int getAge (){
        return this.age;
    }

    public String getSize (){
    return this.size;
    }

    public String getColour (){
        return this.colour;
    }

    public int getWeight (){
        return this.weight;
    }

    public String getName (){
        return this.name;
    }

    public String getType (){
        return this.type;
    }

    // setters
    public void setAge (int newAge){
        this.age = newAge;
    }

    public void setColour (String newColour){
        this.colour = newColour;
    }

    public void setSize (String newSize){
        this.size = newSize;
    }

    public void setWeight (int newWeight){
        this.weight = newWeight;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public void setType (String newType){
        this.type = newType;
    }

    // These 3 are already methods inside of java (built in variables)

    // no comment required
    public String toString (){
        return this.name + " is a cat who is " + this.age + " years old";
    }

    // Always call parameter other, animal is a data type
    // no comment required
    public boolean equals (Animal other){
        return this.age == other.age && this.name.equals(other.name) && this.weight == other.weight;
    }

    public int compareTo (Animal other){
        if (this.age > other.age){
            return 1;
        } else if (this.age < other.age){
            return -1;
        } else {
            return 0;
        }
    }

    public void birthday (){
        this.age = this.age + 1;
    }

    public void eat (String food){
        if (food.equals("pizza")){
            this.weight = this.weight + 5;
        } else if (food.equals("cat food")){
            this.weight = this.weight + 1;
        }
    }

    private double toKg (){
        return this.weight / 2.2;
    }

    public void talk (){
        System.out.println ("I am a cat named " + this.name + " amd I weight " + toKg() + " kilos");
    }
}
