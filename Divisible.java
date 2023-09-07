//22. Write a Java program to check whether a number is divisible by 5 and
// 11 or not. 

import java. util. Scanner;
public class Divisible {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no");
    float no= sc.nextFloat();

    if (no%5==0 ||no%11==0)
          System.out.println("no is divisible by 5 and 11");
    else
    System.out.println("no is not divisible by 5 and 11");
    }
}
