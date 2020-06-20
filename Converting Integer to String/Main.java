import java.util.Scanner;
class Main
{ 
	public static void main(String args[]) 
	{	   
		Scanner in = new Scanner(System.in); 
      int n=in.nextInt();
      //char a[]=new char[];
      int c=0;
        int n1=n;
      int k=0; 
      if( n1 < 0 )
      {
        c=c+1;
        k=1;
        n=n*(-1);
      }
      n1=n;
      while(n > 0)
      {
        c=c+1;
        n=n/10;
      } 
       
      char a[]=new char[c];
      int a1=0;
      int a2=0;
      if( k==1)
      {
        a[0]='-';
       // System.out.print(c);
        for(int i=c-1;i >= 1 ;i--)
      {
         // System.out.print(i);
        a2=n1%10;
        n1=n1/10;
         // System.out.print(a2);
        a[i]=(char) (a2+48);
      }
      }
      else
      {
      for(int i=c-1;i >=0 ;i--)
      {
        a1=n1%10;
        n1=n1/10;
        a[i]=(char) (a1+48);
      }
      }

       System.out.print(a);
    }
}