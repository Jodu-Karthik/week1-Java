import java.util.*;

class main
{
     public static void main(String [] args)
     {
          Scanner x=new Scanner(System.in);
          double a,b,c;
          System.out.print("Enter a b c: ");
          a=x.nextDouble();
          b=x.nextDouble();
          c=x.nextDouble();
          
          double d=(b*b)-(4*a*c);
          if(d==0)
          {
              System.out.print("Equal Roots: ");
              System.out.println("Root1: "+(-b)/(2*a));                             
              System.out.println("Root2: :"+(-b)/(2*a));
          }
          else if(d<0)
          {
              System.out.println("Imaginary Roots: "); 
              System.out.println("Root1: "+(-b/(2*a))+"+i"+(Math.sqrt(-1*d)/(2*a)));
              System.out.println("Root2: "+(-b/(2*a))+"-i"+(Math.sqrt(-1*d)/(2*a)));
          }
          else
          {
              System.out.println("Real Roots: ");
              System.out.println("Root1: "+((-b)+(Math.sqrt(d))/(2*a)));
              System.out.println("Root2: "+((-b)-(Math.sqrt(d))/(2*a)));
          }
     }
}


