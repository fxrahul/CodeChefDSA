//  https://www.codechef.com/LRNDSA01/problems/FLOW007

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int j = 0 ; j < testCase ; j++) {
            String number = br.readLine();
            int n = number.length();
            String reverseNumber = "";
            boolean zeroFlag = false;
            for (int i = n - 1; i >= 0; i--) {
                if (number.charAt(i) == '0' && i == n - 1 || zeroFlag) {
                    if (number.charAt(i - 1) == '0') {
                        zeroFlag = true;
                    } else {
                        zeroFlag = false;
                    }
                } else {
                    System.out.print(number.charAt(i));
                }
            }
            System.out.println();
        }

    }
}
