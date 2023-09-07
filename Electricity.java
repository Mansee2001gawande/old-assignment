 /*write a java program to innput electricity unit charges and calculate total
  electricity bill acc to the given condition for 1 st 50 units rs 0.50/unit
for next 100 units rs 0.75/unit and next 100 units rs. 1.20/unit for unit
 above 250rs 1.50 unit  an additional surcharge of 20% is added to th bill*/
 import java.util.Scanner;
 public class Electricity {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter electricity unit charges");
    double unit = sc.nextDouble();

double s1=(unit*0.50);
double s2=(unit*0.75);
double s3=(unit*1.20);
double s4=(unit*1.50);
        
if (unit<=50) 
  System.out.println("b/w 1 to 50 unit electricity bill is="+s1);  
  else if (unit>=150)
  System.out.println("b/w 50 to 150 unit electricity bill is="+s2);  
 else if (unit>=250) 
  System.out.println("b/w 150 to 250 unit electricity bill is="+s3);  
 } 
       
        }
    
 
    

