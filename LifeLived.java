public class LifeLived {
    public static int getYearsLived(int thisYear,int birthYear){
        int yourAge = thisYear-birthYear;
        return yourAge;
    }
    public static LifeLived.AgeDetails getHoursLived(int thisYear,int birthYear){
        int yourAgeinDays = (thisYear-birthYear)*365;
        int yourAgeinHours = yourAgeinDays*24;
        LifeLived object = new LifeLived();
        AgeDetails details = object.new AgeDetails(LifeLived.getYearsLived(thisYear, birthYear), yourAgeinDays, yourAgeinHours);
        return details;
    }
    public static void main(String[] args) {
        System.out.println("Your age is "+LifeLived.getYearsLived(2025,2010)+" Years");
        System.out.println("You Lived for "+LifeLived.getHoursLived(2025, 2010));
    }
    class AgeDetails{
        int yearsLived;
        int daysLived;
        int hoursLived;
        public AgeDetails(int yearsLived,int daysLived,int hoursLived){
            this.yearsLived = yearsLived;
            this.daysLived= daysLived;
            this.hoursLived=hoursLived;
        }
        public String toString(){
            return yearsLived +" " +daysLived + " "+hoursLived;
        }
    }
}
