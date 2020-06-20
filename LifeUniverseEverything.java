// https://www.codechef.com/LRNDSA01/problems/TEST

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LifeUniverseEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int number = Integer.parseInt(br.readLine());
            if(number  == 42){
                break;
            }
            System.out.println(number);
        }
    }
}
