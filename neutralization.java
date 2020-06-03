import java.util.*;
class neutralization 
{
   
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        char stack[] = new char[len];
        String acid = scan.next();
        int top=-1;
        for(int i=0;i<acid.length();i++)
        {
            char ch = acid.charAt(i);
            if(top==-1)
            {
                top+=1;
                stack[top] = ch;
            }
            else
            {
                if(stack[top] == ch)
                {
                    top-=1;
                }
                else
                {
                    top+=1;
                    stack[top] = ch;
                }
            }
        }
        System.out.println(top+1);
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]);
        }
    }
}

