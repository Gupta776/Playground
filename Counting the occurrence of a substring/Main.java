import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int str1_len = str1.length();
    int str2_len = str2.length();
    int occr_cnt = 0;
    for(int i = 0;i < (str1_len - str2_len + 1);i++){
      boolean is_match = true;
      for(int j = 0;j < str2_len;j++){
        if(str1.charAt(i + j) != str2.charAt(j)){
          is_match = false;
        }
      }
      if(is_match == true){
        occr_cnt++;
      }
    }
    System.out.println(occr_cnt);
  }
}