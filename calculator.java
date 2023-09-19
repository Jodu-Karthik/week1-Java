import java.util.*;

class main
{
    public static void main(String [] args)
    {
        Scanner x=new Scanner(System.in);
        
        int a,b;
        System.out.print("Enter a b: ");
        a=x.nextInt();
        b=x.nextInt();
        
        System.out.println();
        System.out.print("Enter Operator\n 1.add\n2.Sub\n3.Mul\n4.Div\n5.Mod: ");
        int op=x.nextInt();
        
        switch(op)
        {
            case 1:
                 System.out.println("Sum: "+(a+b));
                 break;
            case 2:
                 System.out.println("Difference: "+(a-b));
                 break;
            case 3:
                 System.out.println("Product: "+(a*b));
                 break;
           case 4:
                 System.out.println("Quotient: "+(a/b));
                 break;
          case 5:
                 System.out.println("Remainder: "+(a%b));
                 break;
          default:
                 System.out.println("Enter a valid Number for Operator");                 
        }
    }
}
