import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%2==0){
            a++;
        } 
        for(int i = 0; i<=b; i+=2){
            System.out.print((a+i)+" ");
        }
        
    }
}