package Datastructures;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
* print all the common elements from 2 set of inputs in sorted order
* eg.
* input:
* 6 (n1)
* 8 (n2)
* 1 2 4 8 3 5 (set1)
* 2 8 3 1 6 9 10 8 (set2)
* output:
* 1 2 3 8 (output : sorted)
* */

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for (int i = 0; i < n1; i++) {
            int input = sc.nextInt();
            set1.add(input);
        }
        for (int i = 0; i < n2; i++) {
            int input = sc.nextInt();
            if(set1.contains(input)){
                set2.add(input);
            }
        }
        sc.close();
        for (int elem: set2) {
            System.out.print(elem + " ");
        }
    }
}
