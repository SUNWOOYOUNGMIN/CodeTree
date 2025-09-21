import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A+B;
        System.out.printf("%d %.1f",(int)A+B,(double)(A+B)/2);
    }
}