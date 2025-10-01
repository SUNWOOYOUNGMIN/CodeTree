import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int mid = 0;

        for(int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<1; i++) {
        if(arr[i]<arr[i+1]){
            if(arr[i+1]<arr[i+2]){
                mid = arr[i+1];
            } else {
                mid = arr[i+2];
            }

        } else if (arr[i+1]<arr[i+2]){
            if(arr[i+2]<arr[i]){
                mid = arr[i+2];
            } else {
                mid = arr[i];
            }
        } else {
            if(arr[i]<arr[i+1]){
                mid = arr[i];
            } else {
                mid = arr[i+1];
            }
        }
        }
        System.out.print(mid);
    }
}