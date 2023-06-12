import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        for (int i = 0; i < x + 1; i++) {
            result += i;
        }
        System.out.println(result);
    }
}

