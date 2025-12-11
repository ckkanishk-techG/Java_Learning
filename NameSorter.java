import java.util.Arrays;

public class NameSorter {
    public static void main(String[] args) {
        String[] names= new String[10];
        names[0]="Kanishk";
        names[1]="A";
        names[2]="Pradanya";
        names[3]="Chitta";
        names[4]="Poorani";
        names[5]="Dada";
        names[6]="Momma";
        names[7]="Chttapa";
        names[8]="Opera";
        names[9]="Google";
        Arrays.sort(names);
        for (String w : names) {
            System.out.println(w);
        }
        


    }
}
