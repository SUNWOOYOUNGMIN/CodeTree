import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        char a = sc.next().charAt(0);
        int b_age = sc.nextInt();
        char b = sc.next().charAt(0);

        if (a=='M' && a_age>=19){
            System.out.print("1");
        } else if (b=='M' && b_age>=19){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
