package Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquares {
    private static Scanner sc;
    public List<Integer> perfectSquares(int a, int b){
        List<Integer>squaresList = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            double sqr = Math.sqrt(i);
            if(sqr==Math.floor(sqr)){
                squaresList.add(i);
            }
        }
        return squaresList;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        PerfectSquares squares = new PerfectSquares();

        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> ans = squares.perfectSquares(a,b);
        for (int item: ans) {
            System.out.print(item+" ");
        }
    }
}
