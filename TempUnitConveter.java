public class TempUnitConveter {
    public static void main(String[] args) {
        double cel = 37.0 ; 
        double far = 98.6 ; 
        double cif = (cel*9/5)+32;
        double fic = (far-32)+5/9;
        System.out.println("Celcuius from of 98.6F is "+ fic);
        System.out.println("Farenhit from of 37 C is "+ cif);
    }
}
