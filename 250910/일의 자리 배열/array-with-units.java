import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int [10];
        c[0] = a;
        c[1] = b;

        for(int i =2; i<10; i++){
            c[i] = (c[i-2]+c[i-1])%10;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(c[i]+" ");
        }
    }
}