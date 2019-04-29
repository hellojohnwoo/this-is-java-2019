package nine.nested.clas;

public class Main {
    public static void main(String[] args) {

        A a = new A();          // Instance Member Class

        A.B b = a.new B();      // Instance Member Class
        b.field1 = 3;
        b.method1();



        A.C c = new A.C();      // Static Member Class
        c.field1 = 3;
        c.method1();

        A.C.field2 = 3;
        A.C.method2();

        a.method();
    }
}
