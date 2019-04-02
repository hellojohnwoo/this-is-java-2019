package constr.overloading;

public class Car {

    // field
    String company = "JW Moters";
    String model;
    String color;
    int maxSpeed;


    // constructor
    Car() { }

    Car(String model) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
