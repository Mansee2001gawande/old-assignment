/*19. W.A.P to check whether the traingle is equilateral, scalene, or 
isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is 
a triangle that has two sides of equal length. Equilateral triangle: In 
geometry, an equilateral triangle is a triangle in which all three sides are
 equal. Scalene triangle: A scalene triangle is a triangle that has three 
 unequal sides. */
 
 import java.util.Scanner;
public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter triangle side1=");
        int side1=sc.nextInt();

        System.out.println("enter triangle side2=");
        int side2=sc.nextInt();
        System.out.println("enter triangle side3");
        int side3=sc.nextInt();
    
        if (side1 == side2|| side2==side3)
            System.out.println("triangle is Equilateral");
          
        else if (side1==side2||side2==side3||side3==side1)
            System.out.println("triangle is isoscales");

          else if (side1!=side2||side2!=side3||side3!=side1)
        System.out.println("triangle is Scalen");
}
    
}

