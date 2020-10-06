package Datastructures;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //input format: 1,2,3,4,5,6,8 or 1, 2, 3, 4, 5, 6, 8
        String[] arr = input.split(",");
        int sum=0,n=0;

        for (String str: arr) {
            n = Integer.parseInt(str.trim());
            sum+=n;
        }
        System.out.print((n*(n+1)/2)-sum);
    }
}
