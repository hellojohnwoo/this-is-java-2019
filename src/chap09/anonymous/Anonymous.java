package chap09.anonymous;

public class Anonymous {
    Person field = new Person() {
        String studentNo;
        void work() {
            System.out.println("Going to the School");
        }

        @Override
            void wake() {
                System.out.println("Wake up AM 6:00");
                work();
            };
        };


    void method1() {
        Person localVar = new Person() {
        String studentNo;
        void walk() {
            System.out.println("Walking on Street");
        }

        @Override
            void wake() {
                System.out.println("Wake up AM 7:30");
                walk();
            };
        };
        localVar.wake();
    }


    void method2(Person person) {
        person.wake();
    }
}
