package chap09.nested.clas;

public class A {
    A() { System.out.println("A 객체가 생성됨"); }

        class B {               // Instance Member Class
            B() { System.out.println("B 객체가 생성됨"); }
            int field1;
            // static int field2;   (X)

            void method1() { }
            // static void method2() { } (X)
        }


        static class C {        // Static Member Class
            C() { System.out.println("C 객체가 생성됨"); }
            int field1;
            static int field2;

            void method1() { }
            static void method2() { }
        }


        void method() {     // Local Member Class
            class D {
                D() { System.out.println("D 객체가 생성됨"); }
                int field1;
                // static int field2;       (X)

                void method1() { }
                //static void method2() { }     (X)
            }

            D d = new D();
            d.field1 = 3;
            d.method1();
        }
}
