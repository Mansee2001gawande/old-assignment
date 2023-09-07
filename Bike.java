/*15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			    15%
     >50000 and <=100000	 10%
     <=50000			     5%			 */ 
  import java.util.Scanner;
  class Bike {
    public static void main(String [] args) {
      double  roadtax ;
      Scanner sc =new Scanner (System.in);
    System.out.println("enter your Bike amount");
    double bike=sc.nextDouble();

     if (bike<=50000)
        System.out.println("roadtax"+(bike)*5/100); 
    else if (bike>50000 && bike<=100000)
        System.out.println("roadtax"+(bike)*10/100); 
     else if (bike>100000)
        System.out.println("roadtax"+(bike)*15/100); 
     
      /*{
      System.out.println("cost include amount+tax );  
    }*/

    }
    
}
