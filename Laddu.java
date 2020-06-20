
// https://www.codechef.com/LRNDSA01/problems/LADDU

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Laddu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < testCase ; i++){
            String[] line1 = br.readLine().split(" ");
            String origin = line1[1];
            int activities = Integer.parseInt(line1[0]);
            long laddu = 0;
            for(int j = 0 ; j < activities ; j++){
                String[] activity = br.readLine().split(" ");
                int n = activity.length;
                if(n > 1){
                    if(activity[0].equals("CONTEST_WON")){
                        int rank = Integer.parseInt(activity[1]);
                        if(rank <= 20) {
                            laddu += 300 + 20 - rank;
                        }else{
                            laddu += 300;
                        }
                    }else{
                        laddu += Integer.parseInt(activity[1]);
                    }
                }else{
                    if(activity[0].equals("TOP_CONTRIBUTOR")){
                        laddu += 300;
                    }else{
                        laddu += 50;
                    }
                }
            }
            if(origin.equals("INDIAN")){
                System.out.println(laddu / 200);
            }else{
                System.out.println(laddu / 400);
            }
        }
    }
}
