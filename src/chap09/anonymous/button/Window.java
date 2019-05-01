package chap09.anonymous.button;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("Calling");
        }
    };


    Window() {
        button1.setOnClickListener(listener);

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Sending a Message");
            }
        });

    }
}
