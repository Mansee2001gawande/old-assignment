//20. W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;
public class Alphabate20 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a character");
    char ch = sc.next().charAt(0);
    if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
    System.out.println("it is an alphabate");
    else 
            System.out.println("it is not a alphabate");
     }
    
}

    
