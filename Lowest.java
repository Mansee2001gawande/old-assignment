//14. WAP to find lowest number among four different number 
import java.util.Scanner;
public class Lowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a no");
    int a = sc.nextInt();
    System.out.println("enter 2nd no");
    int b = sc.nextInt();
    System.out.println("enter 3rd no");
    int c = sc.nextInt();
    System.out.println("enter 4rt no");
    int d = sc.nextInt();

    if (a<b) {
        if(a<c){
            if (a<d) {
                System.out.println ("a is lowest");
            }
         }
     }
     else if(b<c){
            if (b<d) {
                System.out.println ("b is lowest");
            }
     }
    else if (c<d) {
                System.out.println ("c is lowest");
            }
            else {
                System.out.println("d is greater");
            }

    }

    
}
