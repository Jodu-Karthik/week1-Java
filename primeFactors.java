import java.util.*;

class Main
{
    public static boolean prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }


    public static void fact(int n)
    {
        System.out.print("Prime Factors of "+n+" are: ");
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if(prime(i))
                {
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String [] args)
    {
        System.out.print("Enter a no: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        
        fact(n);
    }
}
