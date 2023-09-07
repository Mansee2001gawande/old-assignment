/*26. Write a Java program to input marks of five subjects Physics, Chemistry,
 Biology, Mathematics and Computer.Calculate percentage and grade according 
 to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F */
import java.util.Scanner;
public class Percentage26 {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println ("PHY MARKS");
         int phy = sc.nextInt();
        System.out.println ("CHE MARKS");
         int che = sc.nextInt();
        System.out.println ("MATH MARKS");
         int math = sc.nextInt();
        System.out.println ("BIO MARKS");
         int bio = sc.nextInt();
         System.out.println ("CS MARKS");
         int cs = sc.nextInt();
         int total =phy +che+ math+ bio+ cs;
         float per=(total/500)*100;
        if (per>=90) {
            System.out.println ("grade A");
         }
         else if(per>=80) {
            System.out.println ("grade B");
         }
         else if (per>=70){
            System.out.println ("grade C");
         }
         else if (per>=60){
            System.out.println ("grade D");
         }
         else if (per>=40){
            System.out.println ("grade E");
         }
         else if (per<40){
            System.out.println ("grade F");
         }
}
}


