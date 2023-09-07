//18. W.A.P to check whether given number is even or odd Without using % 
//operator. 
import java.util.Scanner;
public class Withoutmodulas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int num = sc.nextInt();
         int z=num/2;
         if(z*2==num)
         
           System.out.println("no is even="+num);
     
     else 
            System.out.println("no is odd=" +num);
    

    }

    
}
