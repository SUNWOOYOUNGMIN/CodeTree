import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i =0; i<10; i++) {
            a[i] = sc.nextInt();
            if(a[i]%3==0){
                ++cnt1;
            } if (a[i]%5==0){
                ++cnt2;
            }
        }
        System.out.printf("%d %d",cnt1,cnt2);
    }
}