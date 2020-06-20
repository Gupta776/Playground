import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
     try{
       int n=in.nextInt();
       System.out.println(n);
     }catch (InputMismatchException i){
     	System.out.println("Input Mismatch Exception occurred");
     }
   }
}