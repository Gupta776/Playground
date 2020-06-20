import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
    String s1=in.nextLine();
    int str=s1.length();
    int alp[]=new int[26];
    for(int i=0;i<26;i++)
    {
      alp[i]=1;
    }
    for(int i=0;i<str;i++)
    {
      if(s1.charAt(i) >= 'a' && s1.charAt(i)<= 'z')
      {
        int off=s1.charAt(i)-'a';
        alp[off]=0;
      }
      else if(s1.charAt(i) >= 'A' && s1.charAt(i)<= 'Z')
      {
        int off=s1.charAt(i)-'A';
        alp[off]=0;
      }// Type your code here
    }
      for(int i=0;i<26;i++)
      {
        if(alp[i]==1)
        {
          char ch=(char)('a'+i);
          System.out.print(ch);
          System.out.print(" ");
        }
      }
    }
}