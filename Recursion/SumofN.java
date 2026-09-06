    import java.util.Scanner;

    public class SumofN{
        static int sum=0;
        public static void sumofN(int n){
            if(n==0){
                return;

            }
            sum=sum+n;
            sumofN(n-1);
            


        }
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number:");

            int n=sc.nextInt();
            sumofN(n);
            System.out.println(sum);
        }
    }