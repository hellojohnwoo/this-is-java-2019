package chap06.stat;

public class CalcExam {
    public static void main(String[] args) {

        double res1 = 10 * 10 + Calc.pi;
        int res2 = Calc.plus(10, 5);
        int res3 = Calc.minus(10,5);

        System.out.println("result1 : " + res1);
        System.out.println("result2 : " + res2);
        System.out.println("result3 : " + res3);
    }
}
