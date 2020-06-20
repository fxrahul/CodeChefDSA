// https://www.codechef.com/LRNDSA01/problems/MULTHREE

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MultipleOf3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase ; i++){
            String line[] = br.readLine().split(" ");
            long k = Long.parseLong(line[0]);
            long d0 = Long.parseLong(line[1]);
            long d1 = Long.parseLong(line[2]);
            long sum = d0 + d1;
            long cycle = ( (2 * sum) % 10 ) + ( (4 * sum) % 10 ) + ( (6 * sum) % 10 ) + ( (8 * sum) % 10 );
            long noOfCycles = (k - 3) / 4;
            long leftOver = ( k - 3 ) - (noOfCycles * 4);
            long total = 0;
            if(k == 2){
                total = sum;
            }else{
                total = sum + (sum % 10) + (noOfCycles * cycle);
                long p = 2;
                for(long j = 1 ; j <= leftOver ; j++){
                    total += (p * sum) % 10;
                    p = ( p * 2 ) % 10;
                }
            }

            if(total % 3 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
