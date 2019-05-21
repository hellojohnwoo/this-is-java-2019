package chap14lamda.sec04.O2;

public class UsingLocalVari {
    void method(int arg) {
        int localVar = 123;

        MyFuncIF02 fi02 = () -> {
            System.out.println(arg);
            System.out.println(localVar + "\n");
        };

        fi02.method();
    }
}
