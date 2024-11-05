package BAEK_JOON.Daon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bae15565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] == 1){
                list.add(i);
            }
    }

        if (list.size() < k){
            System.out.println("-1");
            return;
        }

        int min = Integer.MAX_VALUE;

        for (int start = 0; start < list.size(); start++) {
            int end = start;
            int cnt = 0;
            while (end<list.size() && cnt < k){
                cnt++;
                end++;
            }
            if (cnt == k){
                int left = list.get(start);
                int right = list.get(end-1);
                min = Math.min(min,right-left+1);
            }
        }
        System.out.println(min);
    }
}
