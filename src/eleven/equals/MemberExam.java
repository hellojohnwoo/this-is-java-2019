package eleven.java.lang.equals;

public class MemberExam {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.eqauls(obj2)) {
            System.out.println("obj1 = obj2 (O)");
        } else {
            System.out.println("ojb1 = ojb2 (X)");
        }


        if(obj1.eqauls(obj3)) {
            System.out.println("ojb1 = ojb3 (O)");
        } else {
            System.out.println("ojb1 = obj3 (X)");
        }
    }
}
