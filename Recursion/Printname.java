import java.util.Scanner;

public class Printname {

    public static void Printname(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("MY dsa journey");
        Printname(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printname(n);
    }
}