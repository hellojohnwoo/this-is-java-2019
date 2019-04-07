package seven.classes.inherit;

public class CellPhone {

    String model;
    String color;


    void powerOn() {
        System.out.println("Switch On");
    }

    void powerOff() {
        System.out.println("Switch Off");
    }

    void bell() {
        System.out.println("Ringing Bell");
    }

    void sendVoice(String msg) {
        System.out.println("I : " + msg);
    }

    void receiveVoice(String msg) {
        System.out.println("You : " + msg);
    }

    void hangUp() {
        System.out.println("Hang Up");
    }

}
