package String;


import java.util.Scanner;

/*
* In this 3 Palindrome, Given an input string word, split the string into exactly 3 palindromic substrings.
* Working from left to right, choose the smallest split for the first substring that still allows the remaining
* word to be split into 2 palindromes.
* Similarly, choose the smallest second palindromic substring that leaves a third palindromic substring.
* eg.
* aabaa
* output
* a
* aba
* a
*/
public class ThreePalindrome {
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(new String(sb.reverse()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean flag = true;
        try {
            for (int i = 1; i <= (s.length() - 2) && flag; i++) {
                String substr1 = s.substring(0, i);
                if (isPalindrome(substr1)) {
                    for (int j = i + 1; j <= (s.length() - 1) && flag; j++) {
                        String substr2 = s.substring(i, j);
                        if (isPalindrome(substr2)) {
                            String substr3 = s.substring(j);
                            if (isPalindrome(substr3)) {
                                System.out.print(substr1 + "\n" + substr2 + "\n" + substr3);
                                flag = false;
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e + "to  handle");
        }
        if(flag){
            System.out.println("NONE");
        }
    }
}
