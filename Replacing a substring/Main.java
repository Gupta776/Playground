import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3=in.nextLine();
      System.out.print(s1.replace(s2,s3));
    }
}