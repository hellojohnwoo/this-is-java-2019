package seven.inherit.classes;

public class DmbPhoneExam {
    public static void main(String[] args) {

        DmbPhone dmbPhone = new DmbPhone("JavaPhone", "White",789);


        System.out.println("Model : " + dmbPhone.model);
        System.out.println("Color : " + dmbPhone.color);

        System.out.println("Channel : " + dmbPhone.channel);


        System.out.println();


        dmbPhone.powerOn();
        dmbPhone.bell();
        dmbPhone.sendVoice("Hello");
        dmbPhone.receiveVoice("My name is Soo");
        dmbPhone.sendVoice("Oh~ glad to see you.");
        dmbPhone.hangUp();

        System.out.println();

        dmbPhone.turnOnDmb();
        dmbPhone.changeChannelDmb(123);
        dmbPhone.turnOffDmb();

    }
}
