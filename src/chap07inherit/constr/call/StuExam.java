package chap07inherit.constr.call;

public class StuExam {
    public static void main(String[] args) {
        Student student = new Student("Jane", "991111-222333", 555);

        System.out.println("name : " + student.name);
        System.out.println("ssn : " + student.ssn);

        System.out.println("studentNo : " + student.studentNo);
    }
}
