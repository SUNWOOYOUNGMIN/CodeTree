public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        double f = 9.2;
        double m = 1.3;
        double cm1 = f*30.48;
        double cm2 = m*160934;

        System.out.printf("%.1fft = %.1fcm\n",f,cm1);
        System.out.printf("%.1fmi = %.1fcm\n",m,cm2);
    }
}