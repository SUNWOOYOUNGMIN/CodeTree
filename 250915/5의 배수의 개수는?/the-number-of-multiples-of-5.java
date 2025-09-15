import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int cnt = 0;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(a[i][j]%5==0){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}