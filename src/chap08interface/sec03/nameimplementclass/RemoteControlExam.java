package chap08interface.sec03nameimplementclass;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new TV();                  // (O)
        // rc = new RemoteControl();    (X)

        rc = new Audio();


        rc.turnOn();
        rc.turnOff();
    }
}
