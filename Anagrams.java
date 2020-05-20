import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) 
    {
        int flag=0;
        if(a.length()==b.length())
        {
            String m = a.toLowerCase();
            String n = b.toLowerCase();
            StringBuffer sb2 = new StringBuffer(n);
            for(int i=0;i<a.length();i++)
            {
                char ch = m.charAt(i);
                int index = n.indexOf(ch);
                if(index>=0)
                {
                    sb2.deleteCharAt(index);
                    StringBuffer temp = sb2;
                    n=temp.toString();
                }
                else
                {
                    return false;
                }
            }
            if(n.length()==0)
            {
                return true;
            }
            return false;
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

