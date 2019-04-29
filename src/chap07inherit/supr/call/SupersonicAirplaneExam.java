package chap07.supr.call;

public class SupersonicAirplaneExam {
    public static void main(String[] args) {

        SupersonicAirplane supaair = new SupersonicAirplane();

        supaair.takeOff();


        supaair.fly();

        supaair.flyMode = SupersonicAirplane.SUPERSONIC;
        supaair.fly();

        supaair.flyMode = SupersonicAirplane.NOMAL;
        supaair.fly();


        supaair.land();
    }
}
