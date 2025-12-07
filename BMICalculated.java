import java.util.Scanner;;
public class BMICalculated {
    public static void main(String[] args) {
        System.out.println("This is BMI Calculation Station");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Weight : ");
        double weight = input.nextDouble();
        System.out.print("Enter Your Height in Meters : ");
        double height = input.nextDouble();
        double bmi = weight/(Math.pow(height, 2));
        //int BMI = (int)bmi;
        System.out.println("Your BMI is : "+bmi);
        if (bmi>25){
            double overweight = bmi - 25;
            System.out.println("You are overweight by : "+overweight);
        }else if(bmi<=25 && bmi>=18){
            System.out.println("Your Weight is Proper ");
        }else{
            double underweight = 18-bmi;
            System.out.println("You are underweight by : "+underweight);
        }
        input.close();
    }
}
