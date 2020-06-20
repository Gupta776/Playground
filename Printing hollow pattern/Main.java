import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      for(int i=1;i<=n;i++)
      {
        if(i==1 || i== n)
        {
          for(int i1=1;i1<=n;i1++)
              System.out.print("*");
        }
        else
        {
        for(int i2=1;i2<=n;i2++)
        {
         
          if(i2==1 || i2==n)
          {
          System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        }
        System.out.print("\n");
      }
	}
}