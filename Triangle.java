/*21. Java program to check whether the triangle is valid or not if angles 
are given. Hint:- The angle property of the triangle says that the sum of
 all three angles should be equal to 180.*/ 
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three triangle side");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
       int total =  side1 + side2 + side3;
        if (total == 180)
            System.out.println("triangle is valid");
          
        else 
            System.out.println("triangle is not valid");
        



    }
    
}
