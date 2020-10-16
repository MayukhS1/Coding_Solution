package Cts2020Solutions;

import java.util.Scanner;

public class GCD {
    private static Scanner sc;
    public static int gcdOfTwo(int n1, int n2){
        while(n1!=n2){
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        return n1;
    }

    public static int gcdOfArr(int []arr){
        int gcd = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            gcd = gcdOfTwo(gcd,arr[i]);
        }
        return gcd;
    }

    public static void main(String[] args) {
       sc = new Scanner(System.in);
       /*int a = sc.nextInt();
       int b = sc.nextInt();
        System.out.printf("gcd of %d and %d is %d",a,b,gcdOfTwo(a,b));*/
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(gcdOfArr(arr));
    }
}
