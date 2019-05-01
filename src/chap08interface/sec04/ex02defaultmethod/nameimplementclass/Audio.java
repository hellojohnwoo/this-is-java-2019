package chap08interface.sec04.ex02defaultmethod.nameimplementclass;

public class Audio implements RemoteControl {
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Turn on the Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Audio");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if(volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now Volume : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) {
            System.out.println("Mute the Audio");
        } else {
            System.out.println("Un-Mute the Audio");
        }
    }
}


