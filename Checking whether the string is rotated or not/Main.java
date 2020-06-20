import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3=s1.concat(s1);
      
    if(s3.contains(s2) )
    {
      System.out.print("Yes");
    }
      else
      {
        System.out.print("No");
      }
      
    }
}