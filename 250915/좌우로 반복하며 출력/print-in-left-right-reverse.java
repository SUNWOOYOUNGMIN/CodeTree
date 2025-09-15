import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int[] row = new int[n];

            for(int j=0; j<n; j++){
                row[j] = j+1;
            }
            if(i % 2 != 0){
                for(int j=n-1; j>=0; j--){
                    System.out.print(row[j]);
                }
            }
            else{
                for(int j = 0; j<n; j++){
                    System.out.print(row[j]);
                }
            }
            System.out.println();
        }
    }
}