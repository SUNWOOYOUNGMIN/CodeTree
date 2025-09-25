import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int r1 = a >= b ? 1:0;
        int r2 = a > b ? 1:0;
        int r3 = a <= b ? 1:0;
        int r4 = a < b ? 1:0;
        int r5 = a == b ? 1:0;
        int r6 = a != b ? 1:0;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}