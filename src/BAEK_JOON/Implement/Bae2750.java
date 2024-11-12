package BAEK_JOON.Implement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bae2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (!set.contains(b)) {
                set.add(b);
                arr[index++] = b;
            }
        }

        arr = Arrays.copyOf(arr, index);
        Arrays.sort(arr);

        for (int item : arr) {
            System.out.println(item);
        }
    }
}
