import java.util.Scanner;
class Main
{
   public static void main (String[] args) 
   {
       Scanner in = new Scanner(System.in);
       String s1= in.nextLine();
     String s2 = in.nextLine();
       int n1= s1.length();
            int n2 = s2.length();
     for(int i=0;i<n1;i++)
     {
       int k=0;
       for(int j=0;j<n2;j++)
       {
         if(s1.charAt(i) == s2.charAt(j))
         {
           k=1;
         }
       }
       if(k==0)
       {
         System.out.print(s1.charAt(i));
       }
     }
                          }}