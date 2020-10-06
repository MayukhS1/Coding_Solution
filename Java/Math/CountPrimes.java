package Math;

import java.util.Scanner;

public class CountPrimes {
    private static boolean isPrime(int num){
        boolean flag = true;
        if(num==1)
            return false;

        for(int i=2; i<num/2; ++i){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while(num!=0){
            if(isPrime(num))
                count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
