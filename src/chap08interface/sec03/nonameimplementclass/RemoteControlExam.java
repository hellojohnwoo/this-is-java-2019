package chap08interface.sec03.nonameimplementclass;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {
                System.out.println("Turn on the TV");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off the TV");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > chap08interface.sec03.nameimplementclass.RemoteControl.MAX_VOLUME) {
                    this.volume = chap08interface.sec03.nameimplementclass.RemoteControl.MAX_VOLUME;
                } else if (volume < chap08interface.sec03.nameimplementclass.RemoteControl.MIN_VOLUME) {
                    this.volume = chap08interface.sec03.nameimplementclass.RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("Now Volume : " + this.volume);
            }

            public void otherMethod() { }
        };
    }
}
