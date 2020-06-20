import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int a = 0,b = 0;
      a = com(n1,n2);
      b = com(a,n3);
      System.out.println(b);
	}
  public static int com(int a,int b)
  {
    if(a > b)
    {
      return a;
    }
    else
    {
      return b;
    }
  }
}