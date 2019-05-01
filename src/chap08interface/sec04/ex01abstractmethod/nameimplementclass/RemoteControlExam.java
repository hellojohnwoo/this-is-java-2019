package chap08interface.sec04.ex01abstractmethod.nameimplementclass;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new TV();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
