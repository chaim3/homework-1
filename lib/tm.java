package lib;
import java.util.Scanner;


public class tm {
    public static void main(String[] args) {
        double start_fee = 10.5;
        double price_KM = 3.5;
        double price_luggage = 2;
        
        Scanner t = new Scanner(System.in);
        System.out.println("Theres a starting fee of $10.5 ");      
        //Amount of KM they are traveling
        System.out.print("How many KM do you want to travel?: ");
        double KM = t.nextDouble();
        //Amount of luggage 
        System.out.print("How much luggage would you like to bring?: ");
        double luggage = t.nextDouble();
        // To give a price
        double Total = (start_fee + price_KM * KM + luggage * price_luggage)*10;

        System.out.println("Your final price is: $" + Total);

        t.close();



}
    
}
