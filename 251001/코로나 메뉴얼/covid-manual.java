import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cntA = 0; // A 그룹 카운트

        for (int i = 0; i < 3; i++) {
            char symptom = sc.next().charAt(0); // Y or N
            int temp = sc.nextInt();            // 체온

            if (symptom == 'Y' && temp >= 37) {
                cntA++;
            }
        }

        if (cntA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}