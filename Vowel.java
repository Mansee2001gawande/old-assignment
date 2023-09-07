//12. Check given character is vowel or not using switch case 
 import java.util.Scanner;
public class Vowel {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a character");
    char ch = sc.next().charAt(0);
    
    switch (ch) 
    {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
     System.out.println("vowel");
       break;
       default :
            System.out.println("char is not vowel");
           }
}
    }


