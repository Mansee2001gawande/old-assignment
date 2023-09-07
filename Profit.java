//25. Write a Java program to calculate profit or loss. 
import java.util.Scanner;
public class Profit { 
public static void main(String [] args) {
 Scanner sc =new Scanner (System.in);
 System.out.println("enter cost price");
 int cp=sc.nextInt();                                //cp = purchase sp = selling
 System.out.println("enter selling price");
 int sp =sc.nextInt(); 
 
 if (cp>sp)
    System.out.println("loss");
    else
    System.out.println("profit");
    
}
}
