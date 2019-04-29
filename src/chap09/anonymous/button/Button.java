package nine.anonymous.button;

public class Button {
    OnClickListener listener;       // field

    void setOnClickListener(OnClickListener listener) {    // change field -> (A, B, ..)
        this.listener = listener;
    }

    void touch() {              // method
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}
