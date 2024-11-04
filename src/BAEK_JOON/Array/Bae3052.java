package BAEK_JOON.Array;

import java.io.*;
import java.util.*;

public class Bae3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) % 42;
            set.add(num);
        }
        System.out.println(set.size());
    }
}
