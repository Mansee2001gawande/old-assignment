/*13. Write a Java program that keeps a number from the user and generates an 
integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday */
import java.util.Scanner;
public class Week {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a no b/w 1 to 7");
        int n=sc.nextInt();

        if (n==1){
         System.out.println("Monday");   
        }
        else if (n==2){
            System.out.println("Tuesday");
        }
        else if (n==3) {
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thursday");
        }
        else if (n==5){
            System.out.println("Friday");
        }
        else if (n==6){
            System.out.println("Saturday");
        }
        else if (n==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("ERROR:");
        }
}
    
}