package chap08interface.sec03.multi;

public class SmartTV implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Turn On the Smart-TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off the Smart-TV");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now VOLUME" + volume);
    }

    @Override
    public void search(String url) {
        System.out.println("Searching" + url);
    }
}
