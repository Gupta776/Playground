import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    public static boolean userName(String str) 
  { 
    return (str.matches("^[a-zA-Z0-9_-]*$")); 
  } 
  public static boolean email(String str) 
  { 
    return (str.matches("^[a-z0-9@_.]*$")); 
  } 
    public static boolean passsword(String str) 
  { 
    return (str.matches("^[a-zA-Z0-9@#$%]*$")); 
  } 
  public static void main(String a[]){
    
   Scanner in = new Scanner(System.in);
       String str1 = in.nextLine();
    String str2 = in.nextLine();
    String str3 = in.nextLine();
     System.out.println("Is "+str1+" a valid user name? "+userName(str1)); 
     System.out.println("Is "+str2+" a valid email address? "+email(str2));
     System.out.println("Is "+str3+" a valid password? "+passsword(str3));
    }
}