package chap09.Example;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("Running a Bicycle");
        }

    };

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Running a Motercycle");
            }
        };
        localVar.run();
    }

    void method2(Vehicle v){
        v.run();
    }
}
