//Name - Daksh
// Date - 14/11/24
// Purpose - Class is able to calculate the area and perimeter of the rectangle

public class Rectangle {
    //two instance variables, one for height and another for width.
    private int width;
    private int length;
    public Rectangle() {
        this.width = 10;
        this.length = 20;
    }
    public Rectangle(int w, int l) {
        this.width = w;
        this.length = l;
    }
    public int area(){
        return (this.length * this.width);
    }
    public int perimeter(){
        return 2 * (this.length + this.width);
    }
    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
    public void setWidth(int w){
        this.width = w;
    }
    public void setLength(int l){
        this.length = l;
    }
    public boolean equals(Rectangle r){
        if(r.getLength()== this.length && r.getWidth()== this.width)
            return true;
        else
            return false;
    }
    public int compareTo(Rectangle r){
//if they are equal return 0, otherwise return based on relative areas
        if(r.equals(this))
            return 0;
        else if (r.area()>this.area())
            return -1;
        else
            return 1;
    }
    public String toString(){
        return "width="+this.width+", length="+this.length;
    }
}