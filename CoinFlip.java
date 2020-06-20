// https://www.codechef.com/LRNDSA01/problems/CONFLIP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinFlip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < testCase ; i++){
            int numberOfGames = Integer.parseInt(br.readLine());
            for(int j = 0 ; j < numberOfGames ; j++){
                String[] line = br.readLine().split(" ");
                int l = Integer.parseInt(line[0]);
                int n = Integer.parseInt(line[1]);
                int q = Integer.parseInt(line[2]);
                if( (n&1) == 0 ){
                    System.out.println(n / 2);
                }else{
                    if( l == q ){
                        System.out.println(n / 2);
                    }else{
                        System.out.println( (n / 2) + 1 );
                    }
                }
            }
        }
    }
}
