import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    StringBuilder str=new StringBuilder(s);
    StringBuilder str1=new StringBuilder(" ");
   char ch=s.charAt(0);
    if(ch=='I')
    {
       System.out.print("I evol avaJ" );
    }
    else
    {
    System.out.print("Programming is Fun!!!");
    }
  }
}