package chap07inherit.classes.inherit;

public class DmbPhone extends CellPhone {

    int channel;


    DmbPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }


    void turnOnDmb() {
        System.out.println("Start receiving channel number : " + channel);
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("Switch to channel number : " + channel);
    }

    void turnOffDmb() {
        System.out.println("Stop the receiving broadcast");
    }

}
