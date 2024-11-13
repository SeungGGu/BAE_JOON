package BAEK_JOON.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bae1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    public static boolean isGroupWord(String word) {
        Set<Character> seenChars = new HashSet<>();
        char previousChar = ' ';

        for (int j = 0; j < word.length(); j++) {
            char currentChar = word.charAt(j);

            if (currentChar != previousChar) {
                if (seenChars.contains(currentChar)) {
                    return false;
                }
                seenChars.add(currentChar);
            }
            previousChar = currentChar;
        }
        return true;
    }
}
