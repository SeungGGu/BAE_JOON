package BAEK_JOON.Advanced1;

import java.io.*;

public class Bae2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringBuffer result = new StringBuffer();

        // 한 개의 라인을 만들기 위한 반복문
        for(int i = 1; i<=2*N-1 ; i++){
            StringBuilder line = new StringBuilder();

            //정방향 삼각형
            if(i<=N){
                for(int j = 1; j<=N-i; j++){
                    line.append(" ");
                }
                for(int j =1; j<=2*i-1;j++){
                    line.append("*");
                }
            }
            //역방향 삼각형
            else{
                for(int j = 1; j<=i-N;j++){
                    line.append(" ");
                }
                for(int j = 1; j<=2*(2*N-i)-1;j++){
                    line.append("*");
                }
            }
            result.append(line).append("\n");
        }

        bw.write(result.toString());
        bw.flush();

    }
}