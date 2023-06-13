import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int iterateNum = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        for (int i = 0; i < iterateNum; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ballNumber = Integer.parseInt(st.nextToken());

            for(int j = start - 1; j < end; j++) {
                arr[j] = ballNumber;
            }
        }

        for (int j : arr) {
            bw.write(j + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}