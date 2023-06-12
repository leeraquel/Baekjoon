import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());


        while (A != 0 && B != 0) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write( A+B+"\n");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
        }

        br.close();

        bw.flush();
        bw.close();
    }
}

