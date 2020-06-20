// https://www.codechef.com/LRNDSA01/problems/FCTRL

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactorialLeadingZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < numbers; i++){
            long number = Long.parseLong(br.readLine());
            long division = 0;
            long count = 0;
            int j = 1;
            while(true){
                long factorOfFive = (long) Math.pow(5,j);
                division = number / factorOfFive;
                if(division < 1){
                    break;
                }
                count += division;
                j++;
            }
            System.out.println(count);
        }
    }
}
