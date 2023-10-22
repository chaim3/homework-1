import java.util.Scanner;
import java.text.DecimalFormat;

public class bmi{
    public static void main(String[] args) {
        DecimalFormat d=new DecimalFormat("#.##");
        Scanner j=new Scanner(System.in);
        System.out.print("what is your height in meters?: ");
        double h = j.nextDouble();
        System.out.println("how much do you weigh in kg?: ");
        
        double w = j.nextDouble();
        double BMI = w/(h*h);
        String f = d.format(BMI);
        System.out.println("Your BMI is: " + f );
        j.close();

        if(BMI < 18.5){
            System.out.println("Your under weight");
        }
        else if(BMI > 24.9){
            System.out.println("Your overweight! ");
        }
        else{
            System.out.println("You are healthy");
        }
    }
    
}

