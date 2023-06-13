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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        int num = Integer.parseInt(br.readLine());
        String array = br.readLine();
        int searchNum = Integer.parseInt(br.readLine());
        int count = 0;

        int[] arr = new int[num];

        st = new StringTokenizer(array, " ");
        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j : arr) {
            if (j == searchNum) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
        
    }
}