package Datastructures;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NotCommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> outputSet = new TreeSet<>();

        for (int i = 0; i < n1; i++) {
            int input = sc.nextInt();
            set1.add(input);
        }
        for (int i = 0; i < n2; i++) {
            int input = sc.nextInt();
            set2.add(input);
            if(!set1.contains(input))
                outputSet.add(input);
        }
        sc.close();
        for (int elm: set1) {
            if(!set2.contains(elm)){
                outputSet.add(elm);
            }
        }

        for (int elem:
             outputSet) {
            System.out.print(elem+ " ");
        }
    }
}
