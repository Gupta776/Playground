import java.util.Scanner;
class Main
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
int n = str.length();
     char a[]=new char[n];
     StringBuilder a1=new StringBuilder (str);
     //a1=str;
    // a[0]=a1.charAt(0);
    // System.out.print(a[0]);
     int k=0;
     for(int i=0;i<n;i++)
     {
       if(str.charAt(i)!='a')//|| str.charAt(i)!='u' )//|| a1.charAt(i)!='e'|| a1.charAt(i)!='E'|| a1.charAt(i)!='i'|| a1.charAt(i)!='I'|| a1.charAt(i)!='o'|| a1.charAt(i)!='O'|| a1.charAt(i)!='u' ||a1.charAt(i)!='U')
          
       {
         if(str.charAt(i)!='u')
         {
            a[k]=a1.charAt(i);
         System.out.print(a[k]);
            k++;
         }}
     }
     for(int i=0;i<k;i++)
     {
       //System.out.print(a[k]);
     }
   }
}