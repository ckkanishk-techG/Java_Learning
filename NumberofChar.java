public class NumberofChar {
    public static int findString(String inputString,char target){
            if (inputString.length()==0){
                return 0;
            }
            String nowString=inputString.substring(1);
            if (inputString.charAt(0)==target){
                return 1+findString(nowString, target);
            }
            return findString(nowString, target);
            
            
    }
    public static void main(String[] args) {
        System.out.println(NumberofChar.findString("chittappa", 'd'));
    }
}
