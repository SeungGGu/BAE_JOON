package SwEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sw2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());


        for (int i = 1; i <= T; i++) {
            int sum = 0;

            String[] input = bufferedReader.readLine().split(" ");

            for (int j=0; j<10; j++){
                sum += Integer.parseInt(input[j]);
            }

            int avg = Math.round(sum / 10.0f);

            System.out.println("#" + i + " " + avg);
        }
    }
}
