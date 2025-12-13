import java.util.ArrayList;
import java.util.List;

public class Department {
    public static void main(String[] args) {
    List<Proffessor> proffessorList = new ArrayList<Proffessor>(); //aggregation  
    Proffessor dr1 = new Proffessor();//obj
    Proffessor dr2 = new Proffessor();
    Proffessor annoyingProf1 = new Proffessor();
    dr1.name= "Kanishk";
    annoyingProf1.name="Chitta";
    dr2.name="Chittapa";
    proffessorList.add(annoyingProf1); 
    proffessorList.add(dr1);
    proffessorList.add(dr2);
    System.out.println(proffessorList.get(1));
    System.out.println(proffessorList.get(2));
    System.out.println(proffessorList.get(0));
    }
}
