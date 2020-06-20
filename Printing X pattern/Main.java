import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int i1=0;i1<n;i1++)
        {
          if( i1+i==n-1 || i1==i)
          {
          System.out.print("*");
          }
          else
           System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}