package chap09.Example;

public class NestedClassExam {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Tire tire = myCar.new Tire();

        Car.Engine engine = new Car.Engine();
    }
}
