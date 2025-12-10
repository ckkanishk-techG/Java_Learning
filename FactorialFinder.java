public class FactorialFinder {
    static int factorial = 1;
    public static int findFactorial(int n){
        //Base Case
        if(n==1){
            return 1;
        }else{
            //moving towards base case
            return n*findFactorial(n-1);
        }
/* 
VALIDATION
f(1)=1
f(2)=2*f(1)=2*1=2
f(3)=3*f(2)=3*2=6
 */
    }
    public static void main(String[] args) {
        System.out.println(FactorialFinder.findFactorial(5));
    }
}
