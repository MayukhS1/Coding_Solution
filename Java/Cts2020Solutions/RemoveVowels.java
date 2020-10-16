package Cts2020Solutions;

import java.util.Scanner;

public class RemoveVowels {
    private static Scanner sc;
    public String removeVowels(String str){
        char []arr = {'a','e','i','o','u','A','E','I','O','U'};
        for (char ch:
             arr) {
            str = str.replace(Character.toString(ch),"");
        }
        return str;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        RemoveVowels removeVowels = new RemoveVowels();
        System.out.println(removeVowels.removeVowels(input));
    }
}
