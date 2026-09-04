import java.util.Scanner;

public class Print1ToN {

    static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNumbers(1, n);
    }
}