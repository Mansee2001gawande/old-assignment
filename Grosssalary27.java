/*27. Write a Java program to input basic salary of an employee and calculate 
its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, 
DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% */
import java.util.Scanner;
public class Grosssalary27 {
 public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter your basic Salary");
    double basic= sc. nextDouble();
    double hra1=(basic*20)/100;
    double da1=(basic*80)/100;
    double gs1=basic +hra1 + da1;

    double hra2=(basic*25)/100;
    double da2=(basic*90)/100;
    double gs2=basic +hra2 + da2;

    double hra3=(basic*30)/100;
    double da3=(basic*95)/100;
    double gs3=basic +hra3 + da3;

if (basic<=10000)
    System.out.println("GROSS SALARY IS="+gs1);

else if (basic<=20000)
System.out.println("GROSS SALARY IS="+gs2);

else if (basic<=20000)
System.out.println("GROSS SALARY IS="+gs3);
 } 
}
