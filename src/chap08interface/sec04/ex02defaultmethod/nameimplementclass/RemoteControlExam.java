package chap08interface.sec04.ex02defaultmethod.nameimplementclass;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new TV();
        rc.turnOn();
        rc.setMute(true);
    //  RemoteControl.setMute(true);    (X)
    //  디폴트메소드는 구현객체의 인스턴스메소드 다.

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
    }
}
