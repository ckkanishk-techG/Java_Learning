import java.util.Scanner;
public class AvgCalculator {
    static int AddedNumber=0;
    static int InputNumber=0;
    static int countOfNumbers = 0;
    public static void findAverage(int InputNumber){
        AddedNumber=AddedNumber+InputNumber;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.print("Enter a Number(-1 to exit) : ");
            InputNumber = input.nextInt();
            if(InputNumber==-1){
                break;
            }
            countOfNumbers++;
            AvgCalculator.findAverage(InputNumber);
        }  
    System.out.println(AddedNumber/countOfNumbers);   
    input.close();
    }
}
