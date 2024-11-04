package BAEK_JOON.Advanced1;

import java.util.Scanner;

public class Bae1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'A']++;
        }

        int maxFreq = 0;
        char maxChar = '?';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'A');
            } else if (freq[i] == maxFreq) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}
