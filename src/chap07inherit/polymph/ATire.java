package chap07.polymph;

public class ATire extends Tire {
    public ATire(String location, int maxRoatation) {
        super(location, maxRoatation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " A-Tire 수명: " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " A-Tire 펑크! ***");
            return false;
        }
    }
}