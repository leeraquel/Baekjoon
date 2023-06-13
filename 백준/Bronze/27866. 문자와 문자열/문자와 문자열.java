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

        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());

        String letter = word.substring(num - 1,num);

        bw.write(letter);

        br.close();
        bw.flush();
        bw.close();

    }
}