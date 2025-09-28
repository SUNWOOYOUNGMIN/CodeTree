import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int fin = sc.nextInt();
        int price = 0;

        if (mid >= 90){
            if(fin>=95 && fin<=100){
                price = 100000;
            }
            else if(fin>=90 && fin<95){
                price = 50000;
            } 
            else {
                price = 0;
            }
        } else {
            price = 0;
        }
        System.out.print(price);
    }
}