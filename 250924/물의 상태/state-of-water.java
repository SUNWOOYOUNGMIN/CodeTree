import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int tp = sc.nextInt();
        if(tp<0){
            System.out.print("ice");
        } else if (tp>=100){
            System.out.print("vapor");
        } else{
        System.out.print("water");
        }
    }
}