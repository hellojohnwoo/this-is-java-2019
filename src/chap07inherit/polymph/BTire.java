package chap07inherit.polymph;

public class BTire extends Tire {
    public BTire(String location, int maxRotaion) {
        super(location, maxRotaion);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " B-Tire 수명: " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " B-Tire 펑크! ***");
            return false;
        }
    }
}
