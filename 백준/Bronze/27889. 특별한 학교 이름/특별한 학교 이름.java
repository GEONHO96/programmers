import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String school = sc.next();
        if (school.equals("NLCS")) System.out.println("North London Collegiate School");
        if (school.equals("BHA")) System.out.println("Branksome Hall Asia");
        if (school.equals("KIS")) System.out.println("Korea International School");
        if (school.equals("SJA")) System.out.println("St. Johnsbury Academy");
    }
}