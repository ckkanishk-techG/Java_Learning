import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        double number1 = input.nextDouble();
        System.out.print("Enter Number 2 : ");
        double number2 = input.nextDouble();
        System.out.print("Enter Operation(+ or - or * or /) : ");
        char operations= input.next().charAt(0);
        input.close(); 
        switch (operations) {
            case '+':
                double matha=number1 + number2;
                System.out.println(number1+" + "+number2+" = "+matha);
                break;
            case '-':
                double maths=number1 - number2;
                System.out.println(number1+" - "+number2+" = "+maths);
                break;
            case '*':
                double mathm=number1 * number2;
                System.out.println(number1+" x "+number2+" = "+mathm);
                break;
            case '/':
                double mathd=number1 / number2;
                System.out.println(number1+" x "+number2+" = "+mathd);
                break;
            default:
                System.out.println("Invalid Charecter Entered Please Restart and Try Again");
                break;
        }
    }
}
