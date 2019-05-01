package chap15.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam2 {
    public static void main(String[] args) {
        Map<MapStudent, Integer> map = new HashMap<MapStudent, Integer>();

        map.put(new MapStudent(1, "Kim"), 11);
        map.put(new MapStudent(1, "Kim"), 22);

        System.out.println(map.size());
        System.out.println(map.get(new MapStudent(1,"Kim")));
    }
}
