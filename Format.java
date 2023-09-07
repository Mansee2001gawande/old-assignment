//10. Print number between 1 to 5 in word format 
import java.util.Scanner;
public class Format {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit b/w 1 to 5 in digit");
        int num = sc.nextInt();

        if(num==1){
            System.out.println("one");
        } else if (num==2) {
            System.out.println ("two");
        }
        else if (num==3) {
            System.out.println ("three");
        }
        else if (num==4) {
            System.out.println ("four");
        }
        else if (num==5) {
            System.out.println ("five");
        }

    }
    
}
