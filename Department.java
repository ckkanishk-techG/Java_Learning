import java.util.ArrayList;
import java.util.List;

public class Department {
    public Proffessor findProffessorByName(List<Proffessor> proffessorList,String nameOfProff){
        for(Proffessor prof:proffessorList){
            if(prof.name==nameOfProff){
                return prof ;
            } 
        }
        return null;
    }
    public static void main(String[] args) { 
    List<Proffessor> proffessorList = new ArrayList<Proffessor>(); //aggregation 
    Proffessor dr1 = new Proffessor();//obj
    Proffessor[] proffessors= new Proffessor[3];
    proffessors[0]= new Proffessor();
    proffessors[1]= new Proffessor();
    proffessors[2]= new Proffessor();
    Proffessor dr2 = new Proffessor();
    Proffessor annoyingProf1 = new Proffessor();
    dr1.name= "Kanishk";
    dr1.age=20202020;
    annoyingProf1.name="Chitta";
    dr2.name="Chittapa";
    proffessorList.add(annoyingProf1); 
    proffessorList.add(dr1);
    proffessorList.add(dr2);
    System.out.println(proffessorList.get(1));
    System.out.println(proffessorList.get(2));
    System.out.println(proffessorList.get(0));
    Department finder=new Department();
    System.out.println(finder.findProffessorByName(proffessorList,"Kanishk").age);
    }
}
