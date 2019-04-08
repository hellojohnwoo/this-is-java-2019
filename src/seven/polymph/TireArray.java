package seven.polymph;

public class TireArray {

    Tire[] tirearray = {
            new Tire("앞 왼쪽", 11),
            new Tire("앞 오른쪽", 22),
            new Tire("뒷 왼쪽", 33),
            new Tire("뒷 오른쪽", 44),
    };

    int run() {
        System.out.println("Car is Running");

        for (int i = 0; i < tirearray.length; i++) {
            if (tirearray[i].roll() == false) {
                stop();
                return (i+1);
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("Stop the Car!");
    }

}
