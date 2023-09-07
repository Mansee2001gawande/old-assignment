//2. WAP to calculate area of rectangle
import java.util.Scanner;
public class Rectangle {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter rectangle lenght");
        float l = sc.nextInt();
        System.out.println ("enter rectangle width");
        float w = sc.nextInt();


        System.out.println ("area of rectangle="+(l*w));
    }
}