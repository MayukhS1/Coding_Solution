package Cts2020Solutions;

import java.util.Scanner;

public class Patterns {
    public static void patter1(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = n; j >=i ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void patter2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if (j==1){
                    System.out.print(i);
                }
                else
                    System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void patter3(int m, int n){
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patter4(int n){
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <=(2*i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patter5(int n){
        int p=n;
        if(n>=1 && n<=100)
        {
            for(int i=1;i<=n;i+=2)
            {
                int k=(i-1)*n+1;
                for(int j=0;j<n-1;j++)
                {
                    System.out.print(k+"*");
                    k++;
                }
                System.out.println(k+ " ");
            }
            if(n%2!=0)
            {
                p=n-1;
            }
            for(int i=p;i>0;i-=2)
            {
                int k=(i-1)*n+1;
                for(int j=0;j<n-1;j++)
                {
                    System.out.print(k+"*");
                    k++;
                }
                System.out.println(k+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("--Patter 1--");
        patter1(n);
        System.out.println("--Patter 2--");
        patter2(n);
        System.out.println("--Patter 3--");
        patter3(m,n);
        System.out.println("--Patter 4--");
        patter4(n);
        System.out.println("--Patter 5--");
        patter5(n);

    }
}
