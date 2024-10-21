package SwEA.D2;

import java.util.Scanner;

public class sw1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String strI = Integer.toString(i);

            if (strI.contains("3") || strI.contains("6") || strI.contains("9")) {
                strI = strI.replaceAll("[0]", "");
                strI = strI.replaceAll("[1]", "");
                strI = strI.replaceAll("[2]", "");
                strI = strI.replaceAll("[4]", "");
                strI = strI.replaceAll("[5]", "");
                strI = strI.replaceAll("[7]", "");
                strI = strI.replaceAll("[8]", "");

                strI = strI.replaceAll("[3]", "-");
                strI = strI.replaceAll("[6]", "-");
                strI = strI.replaceAll("[9]", "-");
            }

            System.out.print(strI + " ");
        }
    }
}
