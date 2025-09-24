import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        if(a%2==0){
            a /= 2;
            cnt++;
        } else {
            a = (a+1)/2;
            cnt++;
        }
        System.out.print(cnt);
    }
}