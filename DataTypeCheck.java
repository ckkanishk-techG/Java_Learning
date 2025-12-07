
public class DataTypeCheck {
    int num = 12;
    String str = "hi";
    float flo = 1.23f;
    boolean bool = true;
    double dou = 1.732 ;
    char ch = 'a';
    
    public static void main(String[] args) {
        DataTypeCheck data = new DataTypeCheck();
        System.out.println(data.num);
        System.out.println(data.str);
        System.out.println(data.flo);
        System.out.println(data.bool);
        System.out.println(data.dou);
        System.out.println(data.ch);
        System.out.println(data.str.endsWith("a"));

    }
    
}
