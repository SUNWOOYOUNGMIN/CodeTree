import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%3==0){
            System.out.print("YES ");
        } else {
            System.out.print("NO ");
        }
        if(a%5==0){
            System.out.print("YES ");
        } else {
            System.out.print("NO ");
        }
    }
}