public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp1;
        int temp2;

        temp1 = b; //temp = 6
        temp2 = c;
        b = a; //b=5
        c = temp1; // c = 6
        a = temp2; // a = 7;
        System.out.printf("%d\n%d\n%d\n",a,b,c);
    }
}