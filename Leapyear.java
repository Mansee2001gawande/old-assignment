//15. WAP to check given year is a leap year or not 
import java.util.Scanner;
public class Leapyear {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();

        if(year%4==0){
            System.out.println("year is Leap");
        }
        else{
         System.out.println("the  is not Leap year");

        }


    }

    
}
