import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int happiness = S + 2 * M + 3 * L;
        if (happiness >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}