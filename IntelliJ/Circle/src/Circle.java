public class Circle {
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 5.0;
    }

    public Circle(int r){
        this.radius = r;
    }

    // Getter
    public double getRadius(){
        return this.radius;
    }

    // Setter
    public void setRadius(int r){
        this.radius = r;
    }

    // toString method
    public String toString(){
        return "The radius of the original circle is " + this.radius;
    }

    // equals method
    public boolean equals(Circle other){
        if (other.getRadius() == (this.radius)){
            return true;
        } else {
            return false;
        }
    }

    // compareTo method
    public int compareTo(Circle other){
        if (other.getRadius() > this.radius){
            return -1;
        } else if (other.getRadius() == this.radius){
            return 0;
        } else {
            return 1;
        }
    }

    // Area of the circle
    public double area (){
        return Math.PI * this.radius * this.radius;
    }

    // Perimeter of the circle
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }

    // Diameter of the circle
    public double diameter(){
        return 2 * this.radius;
    }

    // Volume of the circle
    public double volume(){
        return (double) 4 /3 * Math.PI * this.radius * this.radius * this.radius;
    }
}
