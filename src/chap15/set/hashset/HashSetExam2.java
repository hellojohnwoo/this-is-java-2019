package chap15.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("Hong",33));
        set.add(new Member("Hong", 33));

        System.out.println(set.size());
    }
}
