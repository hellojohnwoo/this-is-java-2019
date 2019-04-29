package chap07.polymph;

public class FAExam {
    public static void main(String[] args) {
        TireArray tirearr = new TireArray();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = tirearr.run();
            if (problemLocation != 0) {
                System.out.println(tirearr.tirearray[problemLocation-1].location + "B-Tire로 교체");
                tirearr.tirearray[problemLocation-1] =
                        new BTire(tirearr.tirearray[problemLocation-1].location, 15);
            }
            System.out.println("------------------------");
        }
    }
}
