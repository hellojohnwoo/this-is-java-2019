package chap06.field.decl;

public class CarExam {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        // 필드값 읽기
        System.out.println("Company: " + myCar.company);
        System.out.println("ModelName: " + myCar.model);
        System.out.println("Color: " + myCar.color);
        System.out.println("MaxSpeed: " + myCar.maxSpeed);
        System.out.println("CurrentSpeed: " + myCar.speed);

        // 필드값 변경
        myCar.speed = 60;
        System.out.println("Updated Speed: " + myCar.speed);
    }
}
