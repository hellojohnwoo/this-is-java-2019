package chap15.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("A", "1");
        map.put("B", "22");
        map.put("C", "333");
        map.put("D", "4444");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("input your ID, PASSWORD");
            System.out.println("ID : ");
            String id = scanner.nextLine();

            System.out.println("PASSWORD : ");
            String password = scanner.nextLine();
            System.out.println();

            if(map.containsKey(id)) {
                if(map.get(id).equals(password)) {
                    System.out.println("Login");
                    break;
                } else {
                    System.out.println("Password Error");
                }
            } else {
                System.out.println("ID Error");
            }
        }
    }
}
