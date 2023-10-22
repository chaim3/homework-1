import java.util.Scanner;
public class idc{
    public static void main(String[] args) {
    
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("what number do you want to use?");
        int num1 = inp.nextInt();
        System.out.println("Choose another number");
        int num2 = inp.nextInt();
        
        System.out.println("do you want to *,-,/ or + to your number?: ");
        var operator = inp.next();

        inp.close();

        switch(operator) {
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
    System.out.println("The result is " + result);

    } 

}