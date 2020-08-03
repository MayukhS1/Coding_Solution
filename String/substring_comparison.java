import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    smallest=sets.first();
    largest=sets.last();
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
