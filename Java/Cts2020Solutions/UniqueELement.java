package Cts2020Solutions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueELement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> uniques = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            uniques.add(input);
        }
        for (int elm:
             uniques) {
            System.out.print(elm+ " ");
        }
    }
}
