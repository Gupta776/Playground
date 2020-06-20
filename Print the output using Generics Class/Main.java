import java.util.*;
import java.io.*;
import java.lang.*;
class Test 
{
  <T> Test(T x, T s ,T f)
  {
    System.out.println("Integer Value: " + x);
    System.out.println("String Value: "+ s);
    System.out.println("Float value: " + f);
  }
}
public class Main 
{   
  public static void main(String args[])
  {
	  Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.nextLine();
		String s= in.nextLine();
		float f =in.nextFloat();
    Test test1 = new Test(x,s,f);
    
  }
}