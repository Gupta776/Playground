import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int n4 = 0,n5 = 0;
      n4 = gcd(n1,n2);
      n5 = gcd(n4,n3);
      System.out.println(n5);
	}
  public static int gcd(int n4,int n5)
  {
    int min = 0,g = 0;
    if(n4 < n5)
    {
      min = n4;;
    }
    else
    {
      min = n5;
    }
    while(min >= 1)
    {
      if((n4 % min == 0) && (n5 % min == 0))
      {
        g = min;
        break;
      }
      min--;
    }
    return g;
    
  }
}