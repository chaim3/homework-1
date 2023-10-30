
// import java.util.*;
import java.util.Scanner;
public class radius {
    public static void ex1() {
        Scanner y= new Scanner(System.in);
        System.out.println( "what is the radius");    
        double radius = y.nextDouble();
        double shetach =  (3.14 * radius * radius);
        System.out.println("your hekef is "+2*3.14*radius);
        System.out.print("your shetach is "+shetach);
        y.close(); 

    }
    
public static void ex2() {
    Scanner s = new Scanner(System.in);

    
    int Breadcost = 12;
    final int Oliveprice = 2;
    final int Cornprice = 2;
    final int Mushroomprice = 2;
    final int Cheeseprice = 3;
    
    System.out.print("Welcome to the Bread Shop.\n");
    System.out.println(" The bread costs $12:");
    System.out.println(" If you want toppings, we have:");
    System.out.println(" Olives $"+ Oliveprice +"\n Corn $" + Cornprice + " \n Mushrooms $"+ Mushroomprice +"\n and\n Cheese $"+Cheeseprice+"\n and if you dont want any (or any more) write 'None'");
    
    // List<String> toppings = new ArrayList<String>();

    loop: for(int i=0; i<4; i++) {

      int qNum = i+1;
      System.out.println("Enter Topping " + qNum +": ");
      String topping = s.next().toLowerCase();

      switch (topping) {
        case "olives":
            Breadcost += Oliveprice;
        break;
    
        case "corn":
            Breadcost += Cornprice;
        break;
        
        case "mushrooms":
            Breadcost += Mushroomprice;
        break;
        
        case "cheese":
            Breadcost += Cheeseprice;
        break; 

        case "none":
        break loop;

        default:
            System.out.println("\n" + topping + " is not an option.\n");
            i--;
      } // End Switch
    }  // End Loop
     
    s.close();

    System.out.println("That will cost you: "+ Breadcost);

    
}
public static void main(String[] args) {
    ex2();
}
}

