package chap08interface.sec03nameimplementclass;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10;
                        int MIN_VOLUME = 0;

    public abstract void turnOn();
                    void turnOff();
                    void setVolume(int volume);


    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("Mute");
        } else {
            System.out.println("Un-Mute");
        }
    }


    static void changeBattery() {
        System.out.println("Change the Battery");
    }
}
