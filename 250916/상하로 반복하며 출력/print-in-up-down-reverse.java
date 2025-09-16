import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정사각형 크기

        for (int i = 0; i < n; i++) {
            int left = i + 1;              // 홀짝 위치 바뀔 때 왼쪽 숫자
            int right = n - i;             // 반대편 숫자

            for (int j = 0; j < n; j++) {
                if ((j % 2) == 0) {
                    System.out.print(left);
                } else {
                    System.out.print(right);
                }
            }
            System.out.println(); // 줄 바꿈
        }
    }
}