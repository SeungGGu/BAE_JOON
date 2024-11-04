package SWEA.D3;

import java.util.Scanner;

public class sw1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 2;

        for (int test_case = 1; test_case <=T; test_case++){
            int s = sc.nextInt();
            String n = sc.next();

            StringBuilder sb = new StringBuilder(n);
            int cnt = 0;

            while (cnt < sb.length() - 1) {
                if (sb.charAt(cnt) == sb.charAt(cnt + 1)) {
                    // 같은 문자가 연속되는 경우, 두 문자를 제거
                    sb.delete(cnt, cnt + 2);
                    // 중복이 제거되었으므로, 앞에서부터 다시 검사
                    cnt = cnt > 0 ? cnt - 1 : 0;
                } else {
                    // 연속되지 않는 경우 다음 문자로 이동
                    cnt++;
                }
            }
            System.out.printf("#%d %s\n", test_case, sb.toString());
        }
    }
}
