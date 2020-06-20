import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      //str2 = str2.replace(str2,str1);
      String[] str = str2.split("\\s");
      //int k=str2.length;
      //System.out.println(k);
       for (int i=0; i < str.length; i++){
      System.out.println(str[i]);
    }
    }
}