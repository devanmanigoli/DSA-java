import java.util.Scanner;
public class Fibonacci{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int first=fibonacci(n-1);
        int second=fibonacci(n-2);
         return first+second;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:");

        int n =sc.nextInt();

       System.out.println(fibonacci(n));

    }
}