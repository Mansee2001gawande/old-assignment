//24. Write a Java program to count total number of notes in given amount. 
import java.util.Scanner;
 public class Note {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter your amount");
        int a=sc.nextInt();
        int fiveh,twoh,oneh,pcs,bis,das;
        int pach,two,ek;

        fiveh=a/500;
        a=(a%500);
        twoh=a/200;
        a=(a%200);
        oneh=a/100;
        a=(a%100);
        pcs=a/50;
        a=a%50;
        bis=a/20;
        a=(a%20);
        das=a/10;
        a=(a%10);
        pach=a/5;
        a=(a%5);
        two=a/2;
        a=(a%2);
        ek=a/1;
        a=(a%1);
        System.out.println(fiveh+ "=  notes of 500");
        System.out.println(oneh+  "=  notes of 200");
        System.out.println(twoh+  "=  notes of 100");
        System.out.println(pcs+  "=   notes of 50");
        System.out.println(bis+  "=   notes of 20");
        System.out.println(das+  "=   notes of 10");
        System.out.println(pach+  "=  notes of 5");
        System.out.println(two +  "=  notes of 2");
        System.out.println(ek +  "=   notes of 1");





    }
    
}
