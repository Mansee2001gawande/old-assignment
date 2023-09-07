/*29. Write a program to input choice from user. If user enter ‘+’ as choice then
 calculate addition of 2 number. If Choice ‘>’ then check which number is
  greaterst. If choice is ‘==’ then check both number is equal or not.*/
  import java.util.Scanner;
  public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println  ("enter a=");
        int a=sc.nextInt();
        System.out.println  ("enter b=");
        int b=sc.nextInt();

        System.out.println  ("enter your choice (+)(>)(==)");
        char no=sc.next().charAt(0);
         switch (no) {
            case '+' : System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '>' : System.out.println(a>b);break;
            case '=' : System.out.println(a==b); break;
            default : System.out.println("do not enter other op");
    }
    }
  }