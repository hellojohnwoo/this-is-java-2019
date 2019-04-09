package seven.interfac;

interface RemoteCon {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("Mute");
        } else {
            System.out.println("No Mute");
        }
    }

    static void changeBattery() {
        System.out.println("please change the battery");
    }
}
