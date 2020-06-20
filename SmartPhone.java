// https://www.codechef.com/LRNDSA01/problems/ZCO14003

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class SmartPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberofCustomers = Integer.parseInt(br.readLine());
        long maxBudget = 0L;
        long[] customerBudget = new long[numberofCustomers];
        for(int i = 0 ; i < numberofCustomers ; i++){
            customerBudget[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(customerBudget);
        for(int i = 0 ; i < numberofCustomers ; i++){
            maxBudget = Math.max(maxBudget, customerBudget[i] * (numberofCustomers - i));
        }
        System.out.println(maxBudget);
    }
}
