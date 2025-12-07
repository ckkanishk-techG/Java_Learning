import java.util.Scanner;
public class PesonalInfo {
    public static void main(String[] args) {
        System.out.println("Hi, This is ICIC Bank. We need some information for our new KYC Program.");
        Scanner input= new Scanner(System.in);
        System.out.print("Your Name : ");
        String name = input.nextLine();
        System.out.print("Your Date of Birth : ");
        String dob = input.nextLine();
        System.out.print("Your Account Number : ");
        String accNum = input.next();
        System.out.print("Your Card Number : ");
        String cardNum = input.next();
        System.out.print("Your Account Password : ");
        String accPass = input.next();
        System.out.println("HA!!! This is not ICIC Bank. This is Scammer 101. All amount from you account has been drained.");
        System.out.println("Your Name : "+name);
        System.out.println("Your DOB : "+dob);
        System.out.println("Your Account Number : "+accNum);
        System.out.println("For Card Number : "+cardNum);
        System.out.println("Your Password : "+accPass);
        System.out.println("Is this correct (Yes/No)");
        String confirm= input.next();
        String conform= confirm.toLowerCase();
        input.close();
        switch (conform) {
            case "yes":
                System.out.println("Thank You!!");
                break;
            case "no":
                System.out.println("Stop Lying I already got into your account");
                break;
            default:
                break;
        }



        
        
        
        
    }
}
