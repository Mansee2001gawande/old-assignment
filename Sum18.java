//18. WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n 
import java.util.Scanner;
class Sum18 {
 public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
   System.out.println("enetr a no");
    int n = sc.nextInt();
    int x=2,i,a=1,sum=0;

    for(i=1;i<=n;i++)
    a=a*x;
    sum=sum+a;
   System.out.println("sum="+sum);
 }
}


 
    

