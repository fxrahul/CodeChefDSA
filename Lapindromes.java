import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.codechef.com/LRNDSA01/problems/LAPIN

class Lapindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int j = 0; j < testCase; j++) {
            String string = br.readLine();
            int length = string.length();
            int splittingPoint = length / 2;
            Map<Character, Integer> hm1 = new HashMap<>();
            Map<Character, Integer> hm2 = new HashMap<>();
            int leftSide = splittingPoint - 1;
            int rightSide = splittingPoint;
            if((length & 1) == 1) {
                rightSide = splittingPoint + 1;
            }
            while(leftSide >= 0){
                Character key = string.charAt(leftSide);
                if(hm1.containsKey(key)){
                    hm1.put(key, hm1.get(key)+1);
                }else{
                    hm1.put(key, 1);
                }
                leftSide--;
            }
            while(rightSide < length){
                Character key = string.charAt(rightSide);
                if(hm2.containsKey(key)){
                    hm2.put(key, hm2.get(key)+1);
                }else{
                    hm2.put(key, 1);
                }
                rightSide++;
            }
            if(hm1.equals(hm2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
