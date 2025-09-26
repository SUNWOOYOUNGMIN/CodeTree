// a가 3배수 || 5배수 => 1  아니면 0 출력
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%3==0 || a%5==0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}