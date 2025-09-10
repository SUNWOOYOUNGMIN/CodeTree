import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int a = sc.nextInt();
            if (a == 0) break;
            list.add(a);
        }

        for (int num : list) {
            System.out.println(num);
        }
    }
}