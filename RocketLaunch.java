import java.util.Scanner;
public class RocketLaunch {
    public static void countdown(int numbertoCountdown){
        for(int i=numbertoCountdown;i>=1;i--){
                System.out.println(i);
        }
        System.out.println("Blast Off!!!!");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbertoCountdown = 0;
        System.out.print("input the number to count down : ");
        numbertoCountdown =input.nextInt();
        RocketLaunch.countdown(numbertoCountdown);
        input.close();


    }
}
