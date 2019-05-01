package chap06.method.retn;

public class CarExan {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("GO");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.out.println("No Need Gas");
        } else {
            System.out.println("Need Gas!");
        }
    }

}
