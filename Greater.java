//6. WAP to find greater among two number 

import java. util. Scanner;
public class Greater {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no");
    int a = sc.nextInt();
    System.out.println("enter 2nd no");
    int b = sc.nextInt();

    if (a>b){
     System.out.println("a is greater");
    }
    else {
        System.out.println("b is greater");
    }
    
}
}