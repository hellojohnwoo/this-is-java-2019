package chap06.constr.ths;

public class Car {

    // Field

    String company = "JwMoters";
    String model;
    String color;
    int maxSpeed;



    // Constuructor
    // Constructor Overloading -> this.

    Car() {

    }


    Car(String model) {
        this(model, "silver", 250);
    }


    Car(String model, String color) {
        this(model, color, 250);
    }


    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
