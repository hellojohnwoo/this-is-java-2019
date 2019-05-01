package chap09.anonymous;

public class AnonymousExam {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();


        anony.field.wake();

        anony.method1();

        anony.method2(new Person() {
            String studentNo;

            void study() {
                System.out.println("Study hard");
            }

            @Override
            void wake() {
                System.out.println("Wake up AM 9:45");
                study();
            }

        });

    }
}

