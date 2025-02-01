import java.util.ArrayList;

public class Car {
    private String type;
    private String model;
    private int doors;
    private String typeOfDrive;
    private int windows;
    StringBuilder mySb = new StringBuilder ();

    public Car (String type, String model, int doors){
        this.type = type;
        this.model = model;
        this.doors = doors;
    }

    public Car (int doors, String typeOfDrive, int windows){
        this.doors = doors;
        this.typeOfDrive = typeOfDrive;
        this.windows = windows;
    }

    // getters
    public String getType (){
        return this.type;
    }

    public String getModel (){
        return this.model;
    }

    public int getDoors (){
        return this.doors;
    }

    public String getTypeOfDrive (){
        return this.typeOfDrive;
    }

    public int getWindows(){
        return this.windows;
    }


    // setters
    public void setType (String newType){
        this.type = newType;
    }

    public void setModel (String newModel){
        this.model = newModel;
    }

    public void setDoors (int newDoors){
        this.doors = newDoors;
    }

    public void setTypeOfDrive (String newTypeOfDrive){
        this.typeOfDrive = newTypeOfDrive;
    }

    public void setWindows (int newWindows){
        this.windows = newWindows;
    }

    public String toString (){
        mySb.append ("Number of doors are " + this.doors);
        mySb.append ("\n Number of windows are " + this.windows);
        return mySb.toString();
    }

    // methods
    // Changes model from sedan to suv
    public void suv (){
        this.doors = this.doors + 2;
    }

    private int moreWindows(){
        if (this.windows == 2){
            this.windows = 4;
        } else if (this.windows == 4){
            this.windows = 4;
        }
        return this.windows;
    }

    public void displayWindows (){
        System.out.println ("The number of windows your car could have is " + this.moreWindows());
    }

    // changes type of drive to AWD
    public void awd (){
        this.typeOfDrive = "AWD";
    }

    public int sumDoors (ArrayList<Car> myList){
        int sumDoor = 0;

        // checks the size of the list and gets each number in the list
        for (int i = 0; i < myList.size(); i++){
            // initializes a variable for the car of each part in the array
            Car car;
            // sets each position in the arrayList to the car variable
            car = myList.get(i);
            // only gets the door from each car
            int doorCar = car.getDoors();
            // adds up door amount
            sumDoor += doorCar;
        }

        return sumDoor;
    }

}
