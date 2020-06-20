import java.util.Scanner;
class Main
{
   public static int sq(int m)
   {
      int x;
     x=m*m;
      return x;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     n=sq(n);
     System.out.println(n); //result printed here
   }
}