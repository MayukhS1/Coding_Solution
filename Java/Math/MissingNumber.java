package Math;

import java.util.Scanner;

public class MissingNumber {
    public int missingNumber(String input){
        String[] arr = input.split(",");
        int sum=0,n=0;
        try {
            for (String str : arr) {
                n = Integer.parseInt(str.trim());
                sum += n;
            }
        }catch (Exception e){
            return -1;
        }
        return (n*(n+1)/2)-sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        MissingNumber number = new MissingNumber();
        System.out.print(number.missingNumber(input));
    }
}
