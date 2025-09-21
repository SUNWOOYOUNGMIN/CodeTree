import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(":");

        // 문자열 -> 정수 변환
        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);


        System.out.println(hour+1+":"+minute);
    }
}