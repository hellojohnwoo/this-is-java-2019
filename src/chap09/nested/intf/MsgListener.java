package chap09.nested.intf;

public class MsgListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("Sending Message");
    }

}
