import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if(price>=3000){
            System.out.print("book");
        } else if (price>=1000){
            System.out.print("mask");
        }else{
            System.out.print("no");
        }
    }
}