package Math;

import java.util.Scanner;

public class NthSumOfDigit {
    private static Scanner sc;

    private static int digitScore(int i){
        int sum=0;
        while(i!=0){
            sum += i%10;
            i/=10;
        }
        return sum;
    }

    public int nthNumber(int n, int k){
        int count = 0, number = 0;
        for (int i = 19; i < n*100+k; i++) {
            if(digitScore(i)==k){
                count++;
                if(count==n){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        NthSumOfDigit number = new NthSumOfDigit();

        int n = sc.nextInt();
        int k = sc.nextInt(); //k is 10<=k<=20

        System.out.println(number.nthNumber(n,k));
    }
}
