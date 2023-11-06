// import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Homework {

//Travel
public static void Travel() {
        double start_fee = 10.5;
        double price_KM = 3.5;
        double price_luggage = 2;

        Scanner t = new Scanner(System.in);
        System.out.println("Welcome to the Traveling Agency");
        System.out.println("Theres a starting fee of $10.5 ");      
        //Amount of KM they are traveling
        System.out.print("How many KM do you want to travel?: ");
        double KM = t.nextDouble();
        //Amount of luggage 
        System.out.print("How much luggage would you like to bring?: ");
        double luggage = t.nextDouble();
        // To give a price
        double Total = (start_fee + price_KM * KM + luggage * price_luggage);

        System.out.println("Your final price is: $" + Total);

        t.close();
    }
//Radius
public static void Radius() {
        Scanner y= new Scanner(System.in);
        System.out.println( "what is the radius");    
        double radius = y.nextDouble();
        double shetach =  (3.14 * radius * radius);
        System.out.println("your hekef is "+2*3.14*radius);
        System.out.print("your shetach is "+ shetach + "\n");
        y.close(); 

    }

//BreadShop    
public static void breadShop() {
    Scanner s = new Scanner(System.in);


    int Breadcost = 12;
    final int Oliveprice = 2;
    final int Cornprice = 2;
    final int Mushroomprice = 2;
    final int Cheeseprice = 3;

    System.out.print("Welcome to the Bread Shop.\n");
    System.out.println(" The bread costs $12:");
    System.out.println(" If you want toppings, we have:");
    System.out.println(" - Olives    $"+ Oliveprice +"\n - Corn      $" + Cornprice + " \n - Mushrooms $"+ Mushroomprice +"\n - Cheese    $"+Cheeseprice+"\n ** if you dont want any (or any more) write 'Done'");

    // List<String> toppings = new ArrayList<String>();

    loop: for(int i=0; i<=4; i++) {


      System.out.println("Enter Topping: ");
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

        case "done":
        break loop;

        default:
            System.out.println("\n" + topping + " is not an option.\n");

      } // End Switch
    }  // End Loop

    s.close();

    System.out.println("That will cost you: "+ Breadcost);


}

//Jumper
public static void Jumper() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how far you jumped in meters ");
        double j1 = s.nextInt();
        double j2 = s.nextInt();
        double j3 = s.nextInt();
        double average = (j1 + j2 + j3) / 3;
        if(average > 5){
            System.out.println("You passed");
        }
        else{
            System.out.println("You failed ");
        }

    }

//Candy    
public static void Candy(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many packages do you have with 11 candies");
        int p11 = s.nextInt();
        System.out.println("How many packages do you have with 25 candies");
        int p25 = s.nextInt();
        System.out.println("How many kids are their");
        int kids = s.nextInt();
        double answer = p11 * 11 + p25 * 25 ;
        kids *= kids;
        int left = (int)answer - kids;
        if(answer > kids){
            System.out.println("You have enough candy for evryone!:");
            System.out.println("You have "+ left +"left");
        }
        else{
            System.out.println("You dont have enough candy");
        }
        s.close();
}

//Buses
public static void Buses(){
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#");
        System.out.println(" Welcome to chaim's buses our buses can hold 51 people \n How many kids do you have? ");
        double kids = s.nextDouble();
        System.out.println("How many teachers ");
        double teachers = s.nextDouble();
        double amount = teachers + kids;
        double buses = amount / 51;
        buses = Math.ceil(buses);
        String b = d.format(buses);
        System.out.println("You need "+ b +" bus:");
        s.close();

    }

//Lottery
public static void Lottery(){
      Scanner s = new Scanner(System.in);
      System.out.println("What is the last 2 digits of your lottery ticket:");
      int lot = s.nextInt();

      if(lot == 25){
          System.out.println("You won 111 NIS!!");
      }
      else if(lot == 33){
          System.out.println("You won 251 NIS");
      }
      else{
        System.out.println("You lost");
      }
    s.close();
    }
//To use the code;'lkpjm'    
public static void main(String[] args) {
    //Travel();
    //Radius();
    //breadShop();

    //Jumper();
    //Candy();
    //Buses();
    //Lottery();

}
}