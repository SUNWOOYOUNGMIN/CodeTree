import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        double avg = Double.parseDouble(st.nextToken());

        if(avg>=1.0){
            System.out.print("High");
        } else if (0.5<=avg){
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }
    }
}