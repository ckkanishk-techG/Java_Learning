public class NumberofChar {
    public static int findString(String inputString,char target){
            if (inputString.length()==0){
                return 0;
            }else{
                int nowString=inputString.charAt(target);
                return nowString;
            }
    }
    public static void main(String[] args) {
        System.out.println(NumberofChar.findString("Hiii", 'i'));
    }
}
