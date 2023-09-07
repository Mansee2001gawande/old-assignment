/*14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		     D     */
import java.util.Scanner;
public class Percentage {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println ("ENTER YOUR PERCENTAGE");
         int per = sc.nextInt();

         if (per>90) {
            System.out.println ("grade A");
         }
         else if(per>80 && per<=90){
            System.out.println ("grade B");
         }
         else if (per>=60 && per<=80){
            System.out.println ("grade C");
         }
         else if (per<60){
            System.out.println ("grade D");
         }
}
}