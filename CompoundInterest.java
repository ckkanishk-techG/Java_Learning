public class CompoundInterest {
    public static void main(String[] args) {
        int P = 5;
        double r = 0.05;
        int n = 2;
        int nt = 2;
        double A1=Math.pow((1+(r/n)),(nt*n));
        double A=P*A1;
        System.out.println("The C.I for "+P+" Amount, Coumpounded "+n+" times per year in "+nt+" years is "+A);
    }
}
//funcion