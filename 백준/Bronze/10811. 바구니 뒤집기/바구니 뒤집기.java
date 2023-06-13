import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int loopNum = Integer.parseInt(st.nextToken());

        int[] basket = new int[num];
        for (int i = 0; i < basket.length; i++){
            basket[i] = i + 1;
        }

        for(int i = 0; i < loopNum; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            while(start < end){
                int temp = basket[start];
                basket[start++] = basket[end];
                basket[end--] = temp;
            }
        }

        for (int j : basket) {
            bw.write(j + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}