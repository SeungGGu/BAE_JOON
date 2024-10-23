package SwEA.D2;

import java.util.Scanner;

public class sw1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int[][] map = new int[9][9];
            int sum = 0;
            int result = 0;
            boolean isFail = false;

            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    map[j][k] = sc.nextInt();
                }
            }

            //가로 확인
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    sum += map[j][k];
                }
                if (!(sum == 45)){
                    isFail = true;
                }
                sum = 0;
            }

            //세로 확인
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    sum += map[k][j];
                }
                if (!(sum == 45)){
                    isFail = true;
                }
                sum = 0;
            }

            //박스 확인
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 9; k += 3) {
                    for (int sj = j; sj < j+3; sj++) {
                        for (int sk = k; sk < k+3; sk++) {
                            sum += map[sj][sk];
                        }
                    }
                    if (!(sum == 45)){
                        isFail = true;
                    }
                    sum = 0;
                }
            }

            if (isFail){
                result = 0;
            }else {
                result = 1;
            }

            System.out.printf("#%d %d\n", i, result);
        }
    }
}
