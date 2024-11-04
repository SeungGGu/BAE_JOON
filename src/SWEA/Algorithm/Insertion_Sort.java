package SWEA.Algorithm;

import java.util.Scanner;

//삽입 정렬은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여,
//자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
public class Insertion_Sort {
    static int input[];
    static int num;
    // 1 4 5 2 3
    static void inertionSort(){
        for (int i = 1; i < num; i++) {
            int temp = input[i];    // 4
            int j = i -1;           // j = 0
            // 4 < 1
            while ((j >=0) && (temp < input[j])){
                input[j+1] = input[j];
                j = j - 1;
            }
            input[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        //주어진 데이터를 Insertion Sort를 사용하여 정렬 하시오.
        //데이터의 최대 크기는 100이다.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            num = sc.nextInt();
            input = new int[num];

            for (int i = 0; i < num; i++) {
                input[i] = sc.nextInt();
            }
            inertionSort();

            System.out.printf("#%d ", test_case);
            for (int i = 0; i < num; i++) {
                System.out.print(input[i] + " ");
            }
            System.out.println();
        }
    }
}
