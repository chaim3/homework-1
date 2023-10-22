
import java.util.*;
import java.util.Scanner;
public class radios {
    public static void ex1() {
        Scanner y= new Scanner(System.in);
        System.out.println( "what is the radios");    
        double radios = y.nextDouble();
        double shetach =  (3.14 * radios * radios);
        System.out.println("your hekef is "+2*3.14*radios);
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
    
    System.out.print("Welcome to the Bread Shop");
    System.out.println(" The bread costs $12:");
    System.out.println("If you want toppings we have:");
    System.out.println(" Olives $"+ Oliveprice +"\n Corn $" + Cornprice + " \n Mushrooms $"+ Mushroomprice +"\n and\n Cheese $"+Cheeseprice+"\n and if you dont want any write 'None'");
    System.out.println("Enter Your first Topping: ");

    List<String> toppings = new ArrayList<String>();

    toppings.add(s.next().toLowerCase());  
    System.out.println("Enter Your Second Topping: ");
    toppings.add(s.next().toLowerCase());
    System.out.println("Enter Your Third Topping");
    toppings.add(s.next().toLowerCase());
    System.out.println("Enter Your Forth Choice");
    toppings.add(s.next().toLowerCase());

    for(String answer:toppings) {
      switch (answer) {
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
        break;

        default:
            System.out.println("\n" + answer + " is not an option.\n");
      }
    }  
     
    s.close();

    System.out.println("That will cost you: "+ Breadcost);

    
}
public static void main(String[] args) {
    ex2();
}
}

