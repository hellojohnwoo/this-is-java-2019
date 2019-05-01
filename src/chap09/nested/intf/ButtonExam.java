package chap09.nested.intf;

public class ButtonExam {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new MsgListener());
        btn.touch();

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Take a Picture");
            }
        });
        btn.touch();
    }
}
