public class RocketLaunch {
    public static void countdown(int numbertoCountdown){ 
        if(numbertoCountdown==0){
            System.out.println("Blast Off!!!!");
            return;}
        System.out.println(numbertoCountdown);
        countdown(numbertoCountdown-1);
    }
    public static void main(String[] args) {
        RocketLaunch.countdown(3);
    }
}
