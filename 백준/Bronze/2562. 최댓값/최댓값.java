import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int index = 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i + 1 ;
            }
        }

        bw.write(max+"\n"+index);

        br.close();
        bw.flush();
        bw.close();

    }
}