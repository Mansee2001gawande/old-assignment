/*12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */ 
import java.util.Scanner;
class Reverse {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter four digit reverse");
        int rev=0,digit = sc.nextInt();

        while(digit>0) {
            rev = (rev*10) + digit % 10;
            digit = digit/10;
        }
        System.out.println ("reverse no is"+rev);


    }
}                       /*enter four digit reverse
                        134
                        reverse no is431
                        PS C:\Users\acer\Documents\Mansi> java Reverse
                        enter four digit reverse
                        4567
                        reverse no is7654 */