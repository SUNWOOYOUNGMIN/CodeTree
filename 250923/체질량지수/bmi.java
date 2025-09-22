import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        double b = (10000.0*w)/(h*h);

        int bmiInt = (int)b; // 소수점 이하 버림
        System.out.println(bmiInt);

        if(b>=25){
            System.out.println("Obesity");
        }
    }
}