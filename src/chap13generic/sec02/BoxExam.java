package chap13generic.sec01;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();

        box.set("BTS");

        String name = (String) box.get();


        box.set(new Apple());
        Apple apple = (Apple) box.get();
    }
}
