import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int reward = 0;

        if (x == y && y == z) {
            reward = 10000 + x * 1000;
        }
        else if (x == y || x == z || y == z) {
            if ( x == y || x == z){
                reward =1000 + x * 100;
            }
            else {
                reward =1000 + y * 100;
            }
        } else {
            int max = Math.max(x,y);
            max = Math.max(max,z);

            reward = max * 100;
        }

        System.out.println(reward);
    }
}
