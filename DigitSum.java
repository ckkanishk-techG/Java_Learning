public class DigitSum {

    public static int calculateSum(int inputNumber) {
        if (inputNumber < 10) {
            return inputNumber;
        }
        int lastDigit = inputNumber % 10;
        int remaining = inputNumber / 10;
        return lastDigit + calculateSum(remaining);
    }
/*
VALIDATION
Input =1234
123 +4 =127
12+7=19
1+9=10
Output 10
*/
    public static void main(String[] args) {
        System.out.println(calculateSum(3373)); 
    }
}
