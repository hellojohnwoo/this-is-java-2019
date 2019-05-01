package chap09.Example;

public class AnonyExam {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.run();

        anony.method1();

        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("Running a Car");
            }

        });
    }
}
