package seven.supr.call;

public class SupersonicAirplane extends AirPlane {

    public static final int NOMAL = 10;
    public static final int SUPERSONIC = 200;

    public int flyMode = NOMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("SuperSonic Flying");
        } else {
            super.fly();
        }
    }
}
