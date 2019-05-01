package chap06.method.outercall;

public class Car {

    int speed;

    int getSpeed() {
        return speed;
    }


    void keyTurnOn() {
        System.out.println("Turn On Key");
    }

    void run() {
        for(int i=10; i<=50; i+=10) {
            speed = i;
            System.out.println("Run (Speed:" + speed + "km/h)");
        }
    }


}
