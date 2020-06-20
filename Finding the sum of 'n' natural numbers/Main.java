import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
    }
   public static int sum(int n)
   {
     int s=0;
     while(n>0)
     {
       s=s+n;
       n--;
     }
     System.out.print(s);
     return 0;
   }
}