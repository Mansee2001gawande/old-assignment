//5. WAP to exchange value of two variable without using third variable and
// arithmetic operator
import java.util.Scanner;
public class Arithmatic {
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
            System.out.println ("without third no after swapping=" +a+" "+b);
        }
    }

    
}
