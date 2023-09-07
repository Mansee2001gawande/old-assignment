//8. WAP to check wheather number is even or odd
import java.util.Scanner;
public class Evenodd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a no");
    int num = sc.nextInt();
    if (num%2==0) 
         
           System.out.println("no  is even="+num);
     
     else 
            System.out.println("no is odd=" +num);
    
    
}
}
