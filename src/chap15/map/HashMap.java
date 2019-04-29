package fifteen.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<String, Integer>();

        map.put("Kim", 11);
        map.put("Lee", 22);
        map.put("Choi", 33);
        map.put("Choi", 4444);
        System.out.println(map.size());

        System.out.println("Choi : " + map.get("Choi"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);

            System.out.println("\t" + key + "\t" + value);

        }
        System.out.println();

        map.remove("Choi");
        System.out.println(map.size());

        Set<Map.Entry<String, Integer>> entrySet
                = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
    }
}
