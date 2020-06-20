// https://www.codechef.com/LRNDSA01/problems/CARVANS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Carvans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < testCase ; i++){
            int numberOfCars = Integer.parseInt(br.readLine());
            String[] carSpeed = br.readLine().split(" ");
            int previousSpeed = Integer.parseInt(carSpeed[0]);
            int maxSpeedCar = 1;
            for(int j = 1 ; j < numberOfCars ; j++){
                int currentSpeed = Integer.parseInt(carSpeed[j]);
                if(currentSpeed <= previousSpeed){
                    maxSpeedCar++;
                    previousSpeed = currentSpeed;
                }

            }
            System.out.println(maxSpeedCar);
        }
    }
}
