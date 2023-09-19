import java.util.*;

class main
{
   public static void main(String [] args)
   {
        System.out.print("Enter a no: ");
        Scanner x=new Scanner(System.in);
        
        int a=x.nextInt();
        int temp=a,rev=0,rem;
        
        while(a!=0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        if(rev==temp)
        {
            System.out.println(temp+" is a palindrome");
        }
        else
        {
            System.out.println(temp+" is not a palindrome");
        }
   }
}
