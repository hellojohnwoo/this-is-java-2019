package seven.interfac;

public class SmartTV implements RemoteCon, Searchable {
    private int volume;

    public void turnOn() {
        System.out.println("Turn On the TV");
    }

    public void turnOff() {
        System.out.println("Turn Off the TV");
    }

    public void setVolume(int volume) {
        if(volume>RemoteCon.MAX_VOLUME) {
            this.volume = RemoteCon.MAX_VOLUME;
        } else if(volume<RemoteCon.MIN_VOLUME) {
            this.volume = RemoteCon.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now Volume : " + volume);
    }

    public void search(String url) {
        System.out.println(url + "Searching");
    }

}
