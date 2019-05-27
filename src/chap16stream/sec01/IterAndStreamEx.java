package chap16stream.sec01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IterAndStreamEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BTS","ABC","XYZ");

        Iterator<String> iterator = ((List) list).iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        Stream<String> stream = list.stream();
        stream.forEach(name-> System.out.println(name));

    }
}
