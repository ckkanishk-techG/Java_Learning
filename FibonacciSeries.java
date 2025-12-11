import java.util.HashMap;
import java.util.Set;

public class FibonacciSeries {
    static  HashMap<Integer,Integer> fmap=new HashMap<>();
    public static int seriesCalculator(int n){
        if (fmap.containsKey(n)){
            return fmap.get(n);
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int fval=seriesCalculator(n-1)+seriesCalculator(n-2);
        fmap.put(n, fval);
        return fval;
        }
 
    public static Set<Integer> getAllKeys(HashMap<Integer,Integer> fmap){
        return fmap.keySet();
    }
/*
VALIDATION
F(1)=0
F(2)=1
F(3)=F(3-1)+F(3-2)=F(2)+F(1)=1+0=1
*/
    public static void main(String[] args) {
        System.out.println(FibonacciSeries.seriesCalculator(2010));
        System.out.println(FibonacciSeries.getAllKeys(fmap));
    }
}