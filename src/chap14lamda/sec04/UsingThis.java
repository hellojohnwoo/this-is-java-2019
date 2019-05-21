package chap14lamda.sec04;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            MyFuncIF myFuncIF = () -> {
                System.out.println(outterField);
                System.out.println(UsingThis.this.outterField + "\n");

                System.out.println(innerField);
                System.out.println(this.innerField + "\n");
            };
            myFuncIF.method();
        }
    }
}
