package nine.anonymous.implement;

public class Anonymous2 {

    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Turn on the TV");
        }
        @Override
        public void turnOff() {
            System.out.println("Turn off the TV");
        }
    };


    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on the Radio");
            }
            @Override
            public void turnOff() {
                System.out.println("Turn off the Radio");
            }
        };
        localVar.turnOn();
        localVar.turnOff();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }

}


