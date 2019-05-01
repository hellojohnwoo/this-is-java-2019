package chap08interface.sec08summary.prob05;

public class ActionExam {
    public static void main(String[] args) {
        Action ac = new Action() {
            @Override
            public void work() {
                System.out.println("Copy");
            }
        };

        ac.work();
    }
}
