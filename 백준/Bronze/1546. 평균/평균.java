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

        int num = Integer.parseInt(br.readLine());

        int[] array = new int[num];
        double[] upgrade = new double[num];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int max = array[array.length - 1];

        double average = 0.0;

        for (int i = 0; i < array.length; i++){
            upgrade[i] =(double) array[i] / max * 100;
        }

        for (int i = 0; i < array.length; i++){
            average = average + upgrade[i];
        }

        average = average / num;

        bw.write(String.valueOf(average));

        br.close();
        bw.flush();
        bw.close();

    }
}