import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n4=n;
      int count=0;
      while(n>0)
      {
        n=n/10;
        count=count+1;
      }
      int count1=count;
      int x=1;
      int n1=0,n2=0;
      int s=0;
      while(count1>0)
      {
        n1=n4%10;
        s=n1+s;
        n4=n4/10;
        count1=count1-1;
      }
      System.out.println(s);
	}
}