import java.util.*;

class main
{
    public static void main(String args[])
    {
        int min=(int) Math.pow(2,31),max=(int) Math.pow(2,-31);
        Scanner x=new Scanner(System.in);    
        System.out.print("Enter n: ");    
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for(int i:a)
        {
            if(i<=min)
            {
                min=i;
            }
            if(i>=max)
            {
                max=i;
            }
        }
        System.out.println(min+" "+max);    
    }
}
