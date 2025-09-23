import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b;

        b = a!=100 ? "failure" : "pass";
        System.out.print(b);
    }
}