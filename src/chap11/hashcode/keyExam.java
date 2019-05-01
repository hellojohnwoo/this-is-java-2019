package chap11.hashcode;

import java.util.HashMap;

public class keyExam {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key(1), "Hong");

        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
