import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i+1;j++)
        {
          System.out.print(a-j+1);
        }
        a=a-1;
        System.out.print("\n");
      }
	}
}