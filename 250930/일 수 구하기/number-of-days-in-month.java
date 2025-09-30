import java.util.*;//

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month<=6 && month%2==0){ //2,4,6
            if(month==2){ //2
                System.out.print("28"); 
            }else { //4,6
                System.out.print("30");
            }
        } else if (month<=8){
            System.out.print("31");
        } else if (month>8){
            if(month%2==0){
                System.out.print("31");
            } else {
                System.out.print("30");
            }
        }else{
            System.out.print("X");
        }
    }
}