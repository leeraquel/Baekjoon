import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int h = 0;
        int m = 0;
        if (y >= 45) {
           h = x;
           m = y -45;
           System.out.println(h + " "+ m);
        } else if (y < 45 && x == 0) {
            h = 23;
            m = 60 - (45 - y);
            System.out.println(h + " "+ m);
        } else if (y < 45) {
            h = x -1;
            m = 60 - (45 - y);
            System.out.println(h + " "+ m);
        }
    }
}