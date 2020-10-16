package Cts2020Solutions;

import java.util.Scanner;

public class FreqOfChar {
    public static int solve(String str, char ch){
        int count =0;
        char []arr = str.toCharArray();
        for (char ch1:
             arr) {
            if(ch1==ch)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println(solve(input,ch));
    }
}
