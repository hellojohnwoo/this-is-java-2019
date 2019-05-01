package chap07inherit.interfac;

public class TV implements RemoteCon {

    private int volume;

    public void turnOn() {
        System.out.println("Turn On the TV");
    }

    public void turnOff() {
        System.out.println("Turn Off the TV");
    }


    public void setVolume(int volume) {
        if(volume>RemoteCon.MAX_VOLUME) {
            this.volume = RemoteCon.MIN_VOLUME;
        } else if(volume<RemoteCon.MIN_VOLUME) {
            this.volume = RemoteCon.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now TV Volume : " + volume);
    }
}
