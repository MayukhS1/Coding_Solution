package String;


import java.util.ArrayList;
import java.util.List;
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
    private static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(new String(sb.reverse()));
    }
    public List<String> kLengthPalindrome(String str, int k) {
        List<String> palindromeList = new ArrayList<>();
        try {
            for (int i = 0; i < str.length() - k + 1; i++) {
                String str1 = str.substring(i, i + k);
                if (isPalindrome(str1)){
                    palindromeList.add(str1);
                }
            }
        }catch (Exception e){
            palindromeList.clear();
            palindromeList.add("error");
        }
        return palindromeList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        KLengthSubstring kls = new KLengthSubstring();
        List<String> ans = kls.kLengthPalindrome(str,k);
        for (String elm:
             ans) {
            System.out.println(elm);
        }

    }
}
