package chap15.list.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExam {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hong", "Shin","Kim");
        for (String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,new Integer(3));
        for (Integer value : list2) {
        // for (int value : ...)
            System.out.println(value);
        }
    }
}
