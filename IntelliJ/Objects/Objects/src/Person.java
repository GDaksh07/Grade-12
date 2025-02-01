// Shortcut alt and insert, then ctrl and click each
public class Person {
    private String name;
    private int age;
    private String hairColour;
    private String eyeColour;
    private int height;

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public int getHeight() {
        return height;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name, int age, String hairColour, String eyeColour, int height) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.height = height;
    }

    public String toString (){
        return "the persons name is " + this.name;
    }

    public boolean equal (Person other){
        return this.age == other.age && this.name.equals(other.name);
    }

    public int compareTo (Person other){
        if (this.age > other.age){
            return 1;
        } else if (this.age < other.age){
            return -1;
        } else {
            return 0;
        }
    }
}
