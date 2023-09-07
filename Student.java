//3. WAP to calculate the percentage of students

import java.util.Scanner;



public class Student {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter student marks in phy");
        float m1 = sc.nextFloat(); 
        System.out.println ("enter student marks in che");
        float m2 = sc.nextFloat();
        System.out.println ("enter student marks in math");
        float m3 = sc.nextFloat();
        float sum= m1+m2+m3;

        float per =(sum/300)*100;
        System.out.println ("your percentage is="+per);

}
                            } /*enter student marks in phy
                            50
                            enter student marks in che
                            50
                            enter student marks in math
                            50
                            your percentage is=50.0 */
