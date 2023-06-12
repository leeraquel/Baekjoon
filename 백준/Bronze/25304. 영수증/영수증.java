import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = sc.nextInt();
        int goodsCategory = sc.nextInt();
        int myCalc = 0;

        for (int i = 0; i < goodsCategory; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            myCalc += a * b;
        }
        if (totalCost == myCalc) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}

