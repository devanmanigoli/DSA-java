import java.util.Scanner;
public class PalindromeRecursion {
    public static boolean palindrome(int i,int j,String name){
        if(i>=j){
            return true;
        }
        if(name.charAt(i)!=name.charAt(j)){
            return false;
        }
        return palindrome(i+1,j-1,name);
        
    }

    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Word:");

       String name=sc.next();

       if(palindrome(0,name.length()-1,name)){
        System.out.println("Palindrome");
       }else{
          System.out.println("Not Palindrome");
       }



    }


}
