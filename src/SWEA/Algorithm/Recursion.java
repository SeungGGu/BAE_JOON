package SWEA.Algorithm;

import java.util.Scanner;

// 재귀는 수학이나 컴퓨터 과학 등에서 자신을 정의할 때 자기 자신을 재 참조하는 방법을 뜻함
// 재귀함수의 형태로 많이 사용된다.
public class Recursion {
    public static void main(String[] args) {
        //주어진 수의 Factorial 값을 구해 아래와 같이 출력하시오.
        //주어지는 수는 1 이상 20 이하의 수이다.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();

            long result = factorial(num);

            System.out.printf("#%d %d! %d\n", test_case, num, result);
        }
    }

    static long factorial(int num){
        if(num == 0){
            return 1;
        }else {
            return num * factorial(num-1);
        }
    }
}
