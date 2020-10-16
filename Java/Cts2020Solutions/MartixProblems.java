package Cts2020Solutions;

import java.util.Scanner;

public class MartixProblems {
    public static void mirrorPrint(int [][]arr, int n1, int n2){
        for (int i = 0; i < n1; i++) {
            for (int j = n2-1; j >= 0 ; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposePrint(int [][]arr, int n1, int n2){
        for (int j = 0; j < n2; j++) {
            for (int i = 0; i < n1 ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [][]arr = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("--Mirror Print answer: --");
        mirrorPrint(arr,n1,n2);
        System.out.println("--Transpose--");
        transposePrint(arr,n1,n2);
    }
}
