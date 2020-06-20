import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int i1=1;i1<=i;i1++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}