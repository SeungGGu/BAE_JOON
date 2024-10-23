package SwEA.D2;

import java.util.Arrays;
import java.util.Scanner;

public class sw1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt(); //10
            int K = sc.nextInt(); //2
            double[][] score = new double[N][3];
            double[][] grade = new double[N][2];
            String[] strGrade = {"A+", "A0", "A-", "B+" , "B0", "B-", "C+", "C0", "C-", "D0"};
            String realGrade = "";

            double limits = N/10;   // (int)limits

            for (int j = 0; j < N; j++) {  // 0 1 2 3 4 5 6 7 8 9
                for (int k = 0; k < 3; k++) {   // 0 1 2
                    score[j][k] = sc.nextInt();
                }
            }

            for (int l = 0; l < N; l++) {
                double cal = score[l][0] * 0.35 + score[l][1] * 0.45 + score[l][2] * 0.2;
                grade[l][0] = l;
                grade[l][1] = cal;
            }

            Arrays.sort(grade, (o1, o2) -> {
                return (int) (o2[1] - o1[1]);
            });

            for (int m = 0; m < N; m++) {
                System.out.println("번호 : " + grade[m][0] + "점수 : " + grade[m][1]);
            }

            for (int h = 0; h < N; h++) {
                if ((int)(grade[h][0]) == (K-1)){
                    int num = (int)(h/limits);
                    System.out.println("num : " + num);
                    realGrade = strGrade[num];
                }
            }
            System.out.println("#" + i + " " + realGrade);
        }
    }
}

/*
1
40 18
69 71 57
92 83 95
100 97 100
97 96 99
98 94 89
53 84 83
80 96 81
100 96 98
100 75 100
69 62 90
99 63 66
66 99 94
98 78 73
97 95 91
86 85 89
76 85 90
98 96 96
94 96 100
62 60 84
70 79 70
97 98 90
94 98 100
75 95 82
94 56 65
80 90 90
97 97 100
93 86 79
93 96 87
100 93 93
79 90 79
88 77 95
73 83 91
72 57 84
95 99 91
86 75 100
100 69 56
85 99 97
100 96 100
98 99 98
79 96 91
*/
