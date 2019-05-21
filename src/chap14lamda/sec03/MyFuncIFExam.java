package chap14lamda.sec02;

public class MyFuncIFExam {
    public static void main(String[] args) {
        MyFuncIF fi;

        fi = (x) -> {
            int result = x * 2;
            System.out.println(result);
        };
        fi.method(1);


        fi = (x) -> { System.out.println(x*3); };
        fi.method(1);


        fi = (x) -> System.out.println(x*4);
        fi.method(1);
    }
}
