import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int i1=1;i1<=n;i1++)
        {
          if(i%2==0)
          {
            if(i1==1)
            {
               System.out.print(i+1);
            }
            else
            {
           System.out.print(i);
            }
          }
          else if(i1==n) 
          {
            System.out.print(i+1);
          }
          else
          {
            System.out.print(i);
          }
        }
        System.out.print("\n");
      }
	}
}