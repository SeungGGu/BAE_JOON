package SWEA.D2;

import java.util.Scanner;

public class RetrySW1954 {
    static int[][] snailArray; // 달팽이 배열
    static int N;              // 배열 크기
    static int[] dx = {0, 1, 0, -1}; // 방향 배열 (오른쪽, 아래, 왼쪽, 위)
    static int[] dy = {1, 0, -1, 0}; // 방향 배열 (오른쪽, 아래, 왼쪽, 위)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int t = 1; t <= T; t++) {
            N = sc.nextInt(); // 배열 크기 입력
            snailArray = new int[N][N]; // N x N 크기의 달팽이 배열 생성

            // 재귀 호출로 달팽이 채우기 시작
            fillSnail(0, 0, 1, 0);

            // 출력
            System.out.printf("#%d\n", t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snailArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // 재귀 함수로 달팽이 배열 채우기
    static void fillSnail(int x, int y, int num, int direction) {
        // 범위를 벗어나거나 이미 값이 있는 경우 종료
        if (x < 0 || x >= N || y < 0 || y >= N || snailArray[x][y] != 0) {
            return;
        }

        // 현재 위치에 숫자 채우기
        snailArray[x][y] = num;

        // 다음 좌표 계산
        int nx = x + dx[direction];
        int ny = y + dy[direction];

        // 다음 좌표가 배열의 범위를 벗어나거나 이미 채워진 경우 방향 전환
        if (nx < 0 || nx >= N || ny < 0 || ny >= N || snailArray[nx][ny] != 0) {
            direction = (direction + 1) % 4; // 방향을 오른쪽으로 90도 회전
            nx = x + dx[direction];
            ny = y + dy[direction];
        }

        // 다음 숫자 채우기
        fillSnail(nx, ny, num + 1, direction);
    }
}
