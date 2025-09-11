import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while(A<=B){
            if(A%2==1){
                System.out.print(A+" ");
                A = 2*A;
            } else {
                System.out.print(A+" ");
                A = A+3;
            }
            if(A>B)
                break;
        }
        
    }
}