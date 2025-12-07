import java.util.Scanner;
public class WhatTypeofDay {
    static int ShouldIRun;
    public enum DayOfWeek{
        MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public static void printDayType(DayOfWeek day){//this is a function
        switch (day) {
            case MONDAY:
                System.out.println("Today is a Weekday.The first day of the week.");
                break;
            case TUESDAY:
                System.out.println("Today is a Weekday.The second day of the week.");
                break;
            case WEDNESDAY:
                System.out.println("Today is a Weekday.The third day of the week.");
                break;
            case THURSDAY:
                System.out.println("Today is a Weekday.The fourth day of the week.");
                break;
            case FRIDAY:
                System.out.println("Today is a Weekday.The fith day of the week.");
                break;
            case SATURDAY:
                System.out.println("Today is a Weekend.The second last day of the week.");
                break;
            case SUNDAY:
                System.out.println("Today is a Weekend.The last day of the week.");
                break;
            default:
                System.out.println("The day you have specified does not exist.Please wake up now.");
                ShouldIRun = 0;
                break;
        }
    }
    public static void main(String[] args) {
        ShouldIRun = 0;
        Scanner input = new Scanner(System.in);
        while (ShouldIRun == 0) {
            
            try{
                System.out.println("What is the day today(In full word) : ");
                String day = input.next().toUpperCase();
                WhatTypeofDay.printDayType(DayOfWeek.valueOf(day));
                ShouldIRun = 1;
            }catch(IllegalArgumentException exception){
                System.out.println("The day you have specified does not exist.Please wake up now!!");
            }
            
        }
        
        input.close();
    }
}
