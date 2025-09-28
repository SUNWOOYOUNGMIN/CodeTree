import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==0){
            if(b>=19){
                System.out.print("MAN");
            } else {
                System.out.print("Boy");
            }
        }else {
            if(b>=19){
                System.out.print("Woman");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}