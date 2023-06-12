import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();

        int H = 0;
        int M = 0;

        if (y + t < 60){
            H = x;
            M = y + t;

        } else if (y + t >= 60){
            int hour = (int) ((y + t) / 60);
            int min = (int) ((y + t) % 60);

            H = x + hour;
            M = min;

            if (H >= 24) {
                H = H - 24;
            }
        }
        System.out.println(H + " " + M);
    }
}
