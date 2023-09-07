/*11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".  */
import java.util.Scanner;
class Urban {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter your sex in m or f");
        char sex = sc.next().charAt(0);
        System.out.println ("enter your age in");
        int age = sc.nextInt();
        System.out.println ("enter your marital y or n ");
        char marital = sc.next().charAt(0);

        if (sex == 'f') {
            System.out.println("you work in urban area");
        }
        else if(age>=20 && age<40) {
        System.out.println("male work anywhere");
        }
         else if(age>=04 && age<60) {
        System.out.println("only b/w 60to40 age employee work in UA");
         }
         else {
            System.out.println("ERROR");
         }
        
}

}                            /*enter your sex in m or f
                                f
                                enter your age in
                                19
                                enter your marital y or n
                                n
                                you work in urban area
                                PS C:\Users\acer\Documents\Mansi>  & 'C:\Program Files\Java\jdk-20\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExs\Mansi_7d31d398\bin' 'Urban' 
                                enter your sex in m or f
                                m
                                enter your age in
                                21
                                enter your marital y or n
                                n
                                male work anywhere
                                enter your sex in m or f
                                m
                                enter your age in
                                40
                                enter your marital y or n
                                y */