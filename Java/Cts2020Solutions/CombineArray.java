package Cts2020Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        for (int i = 0; i < n2; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        Collections.sort(list);
        for (int elm:
             list) {
            System.out.print(elm+ " ");
        }
    }
}
