package chap06.method.outercall;

public class CarExam {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.keyTurnOn();
        myCar.run();

        int speed = myCar.getSpeed();
        System.out.println("Now Speed : " + speed + "km/h");
    }
}
