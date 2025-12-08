import java.util.Scanner;
public class FibonacciSeries {
    public static void seriesCalculator(int numberofContents){
        int f0 = 0;
        int f1 = 1;

            for(int i=0;i<numberofContents;i++){
                    int next=f0+f1;
                    System.out.println(f0);
                    f0=f1;
                    f1=next;
                }
            }
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        int numberofContents = input.nextInt();
        FibonacciSeries.seriesCalculator(numberofContents);
        input.close();
    }
