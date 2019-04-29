package chap07.promo;

public class ChildExam {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); (X)
    }
}
