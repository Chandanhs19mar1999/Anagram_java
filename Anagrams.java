import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
      String s1 = a.toLowerCase();
      String s2 = b.toLowerCase();
      if(s1.length() == s2.length())
      {
          int v=0;
          for(int i=0;i<s1.length();i++)
          {
              v=v^s1.charAt(i);
              v=v^s2.charAt(i);
          }
          if(v==0)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

