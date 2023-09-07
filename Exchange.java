//4. WAP to exchange value to two variable with third variable and without 
//third variable.
import java.util.Scanner;

public class Exchange {
    public static void main (String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter a variable");
        a = sc.nextInt();
        System.out.println ("enter 2nd variable");
        b = sc.nextInt();
        System.out.println ("no before swapping=" +a+" " +b);
         c=a;
         a=b;
         b=c; {
        System.out.println ("no after swapping=" +a+ " " +b);
        }
      }
    }
        
class Without { 
    public static void main (String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter a variable");
        a = sc.nextInt();
        System.out.println ("enter 2nd variable");
        b = sc.nextInt();
        System.out.println ("no before swapping=" +a+" " +b);
         
            a=a+b;
            b=a-b;
            a=a-b;
              {
            System.out.println ("without third no after swapping=" +a+" " +b);
    }



}
}

    
