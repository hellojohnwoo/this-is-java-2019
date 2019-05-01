package chap08interface.sec03.multi;

public class RemoteControlExam {
    public static void main(String[] args) {
        SmartTV stv = new SmartTV();

        RemoteControl rc = stv;
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);


        Searchable searchable = stv; // = new SmartTV();
    }

}
