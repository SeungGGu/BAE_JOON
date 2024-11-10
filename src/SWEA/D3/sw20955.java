package SWEA.D3;

import java.util.Scanner;

public class sw20955 {
    static StringBuilder result;
    static boolean foundSolution;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            StringBuffer s = new StringBuffer(sc.next());
            StringBuffer e = new StringBuffer(sc.next());
            result = new StringBuilder();
            foundSolution = false;

            xy(s, e, 0);

            System.out.println(result);
        }
    }

    static void xy(StringBuffer s, StringBuffer e, int i){
        if (foundSolution){
            result.append("Yes");
        }

        if (s.equals(e)){
            foundSolution = true;
        }

//        if (s.length() == e.length() && (s.compareTo(e) != 0)){
//            return;
//        }

        if (i == 0){
            s.append("Y");
        }

        if (i == 1){
            s.append(s.reverse().append("Y"));
        }

        xy(s, e, 0);

        xy(s, e, 1);
    }
}
