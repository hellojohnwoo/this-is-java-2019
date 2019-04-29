package chap07.method.override;

public class Computer extends Calc {
    @Override
    double areaCircle(double r) {
        System.out.println("Instance Of Computer : areaCircle() Execute");
        return Math.PI * r * r;
    }
}
