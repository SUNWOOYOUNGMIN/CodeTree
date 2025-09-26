// 13배수 이거나 19배수 맞으면 true, 틀리면 false
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%13==0 || a%19==0){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}