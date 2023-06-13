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

        st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int searchNum = Integer.parseInt(st.nextToken());

        String secondLine = br.readLine();
        st = new StringTokenizer(secondLine, " ");

        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j : arr) {
            if (j < searchNum) {
                bw.write(j + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}