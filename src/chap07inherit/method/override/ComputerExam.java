package chap07inherit.method.override;

public class ComputerExam {
    public static void main(String[] args) {
        int r = 10;

        Calc calc = new Calc();
        System.out.println("Area Of Circle : " + calc.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("Area Of Circle : " + computer.areaCircle(r));   // Call Overriding Method
    }
}
