package chap09.nested.intf;

public class CallListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("Calling");
    }

}
