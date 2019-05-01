package chap06.stat;

public class Car2 {

    int speed;

    void run() {
        System.out.println(speed + "km/h 로 달립니다.");
    }

    public static void main(String[] args) {

        Car2 myCar = new Car2();
        myCar.speed = 60;
        myCar.run();
    }
}
