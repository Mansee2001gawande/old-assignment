 /*W.A.P to convert temperature from Fahrenheit to Celsius and Celsius
 to Fahrenheit. For given problem you have to take choice from user. If 
 user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius.
  If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit.
  */ 
import java.util.Scanner;
public class Fahrenheit16 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character (c/f) ");
    char ch =sc.next().charAt(0);
    double fc=0;
    double cf=0;


    if (ch=='F'||ch=='f') {
    System.out.println("enter temp in celcius");
    cf =sc.nextDouble();
    fc=(cf*9/5)+32;
        System.out.println("convert celcius to fah" +fc);
    }

    else if  (ch=='C'||ch=='f') {
    System.out.println("enter temp in fahrenheit");
    fc =sc.nextDouble();
    cf=(fc-32)*5/9;
        System.out.println("convert fahrenheit to celcius" +cf);
    }
}
    
}
