package chap07inherit.polymph;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i=1; i<=5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 A-Tire로 교체");
                    car.frontLeftTire = new ATire("앞 왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 B-Tire로 교체");
                    car.frontRightTire = new BTire("앞 오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒷 왼쪽 A-Tire로 교체");
                    car.backLeftTire = new BTire("뒤 왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒷 오른쪽 B-Tire로 교체");
                    car.backRightTire = new BTire("뒤 오른쪽", 17);
                    break;
            }

            System.out.println("----------------");
        }
    }
}
