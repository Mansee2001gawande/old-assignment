//13. Program to perform arithmetic operation using switch case
import java.util.Scanner;
 class Arithmatic {
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b;
        char ch;
        System.out.println("enter a op");
        ch = sc.next().charAt(0);
        System.out.println("enter a no");
        a = sc.nextInt();
        System.out.println("enter 2nd no");
        b = sc.nextInt();
        switch (ch)
        {
        case '+' : 
     System.out.println("add"+a+b);
     break;
            
        default:
            System.out.println("if you choose the ans will be same");
            break;
    }
} 
}   
