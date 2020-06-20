import java.util.Scanner;
class Main
{
   public static void main (String[] args) 
   {
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       int n = s.length();
     for(int i=n-1;i>=0;i--)
     {
       int c=0;
       for(int j=0;j<i;j++)
       {
         System.out.print(" ");
         c=c+1;
       }
       for(int j=n/2;j<n;j++)
       {
         if(c<n)
         {
         System.out.print(s.charAt(j));
         }
         c=c+1;
       }
       for(int j=0;j<n/2;j++)
       {
         if(c<n)
         {
         System.out.print(s.charAt(j));
         }
         c=c+1;
       }
       c=0;
        System.out.println();
     }
   }
}