import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int n1=n;
      int n2=n;
      int c=0;
      while(n>0)
      {
        n=n/10;
        c=c+1;
      }
       //System.out.println(c);
      int s=0;
      int k1=1;
      for(int j=1;j<=c;j++)
      {
        int k=n1%10;
        //System.out.println(k);
        for(int j1=1;j1<=c;j1++)
        {
          k1=k1*k;
        }
        s=k1+s;
        k1=1;
       // System.out.println(k1);
        n1=n1/10;
      }
      //System.out.println(s);
      if(n2==s)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}