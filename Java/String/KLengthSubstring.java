package String;


import java.util.Scanner;

/*
* You are given a string S, and a number K. Write a code to find all K length substrings
* which are palindrome. Take input from command line.
* eg.
* Input
* academy
* 3
* Output: aca
 * */
public class KLengthSubstring {
    boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(new String(sb.reverse()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KLengthSubstring kls = new KLengthSubstring();
        try {
            String str = sc.nextLine();
            int k = sc.nextInt();

            for (int i = 0; i < str.length() - k + 1; i++) {
                String str1 = str.substring(i, i + k);
                if (kls.isPalindrome(str1))
                    System.out.println(str1);
            }
        }catch (Exception e){
            System.out.println("ERROR");
        }

    }
}
