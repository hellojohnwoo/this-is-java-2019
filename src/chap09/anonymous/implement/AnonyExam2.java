package chap09.anonymous.implement;

public class AnonyExam2 {
    public static void main(String[] args) {
        Anonymous2 anony = new Anonymous2();

        anony.field.turnOn();
        anony.field.turnOff();

        anony.method1();

        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on the Smart-TV");
            }
            @Override
            public void turnOff() {
                System.out.println("Turn off the Smart-TV");
            }
        });
    }
}
