import java.util.*;
public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
        double result = (double) a / b;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
        System.out.println(a % b);
    }
}
