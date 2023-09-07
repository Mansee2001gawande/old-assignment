//11. Find even odd using switch case 
import java.util.Scanner;
public class Switcheven {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a no");
    int num = sc.nextInt();
    switch (num%2) {   //no%2==0
        case 0:
         
           System.out.println("no  is even="+num);
     break;
            // else if n%2==1
        case 1:
            System.out.println("no is odd=" +num);
            break;
    }
} 
}   

