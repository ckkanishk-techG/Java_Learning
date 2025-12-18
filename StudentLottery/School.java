package StudentLottery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class School {

    /**
     * Each entry is an instance of a Student representing one student
     * at the school. Students are in the order they should be scheduled.
     */
    private ArrayList<Student> studentList;

    /**
     * Each entry is an instance of an Elective representing one elective
     * offered at the school.
     */
    private ArrayList<Elective> electiveList;

    /**
     * Precondition: name is the name of an Elective in electiveList
     * Postcondition: Returns the Elective in electiveList with the given name.
     */
    private Elective getElectiveByName(String name) {
        //input is the elective name out put should be the oblject of that elective
        for (int i = 0; i < electiveList.size(); i++) {
            if (electiveList.get(i).getName().equalsIgnoreCase(name)) {
                return electiveList.get(i);
            }
        }
        return null;

    }

    /**
     * Postcondition: Returns the size of electiveList.
     */
    private int getElectiveListSize() {
        return electiveList.size();
    }

    /**
     * Postcondition: Returns the size of studentList.
     */
    private int getStudentListSize() {
        return studentList.size();
    }

    /**
     * Postcondition:
     * - All Students in studentList have been either assigned their
     *   first available elective choice or not assigned.
     * - All Electives in electiveList have been updated appropriately
     *   as Students are assigned to them.
     */
    /*
1.Sort students randomlt
2.For each student get the choices
3.Check if chocke 1 is assigned not complety then assign the student to it
3a.Get Electives through getChoice(i) the use the name to get the object from getElectiveByName()
3a.(by comparing getClassSize and getMaxClassSize)
4.If it is full then check the other options then assign 
4a.Use assignElective() pass the elective 
4b.
5.If all are full then assign null
6Repeat for all other students
*/
    public void assignElectivesToStudents() {
        /* to be implemented in part (b) */
        for(Student student:this.studentList){
           // System.out.println(student);
           if(student.hasElective()){
            continue;
           }
           for(int i=0;i<3;i++){
            String electiveName = student.getChoice(i);
            Elective elective = getElectiveByName(electiveName);
            int maximumSize=elective.getMaxClassSize();
            int currentSize = elective.getClassSize();
            if(currentSize<maximumSize){
                student.assignElective(elective);
                elective.addStudent(student);
            }
           }
        }
    }

    /**
     * Postcondition: Returns a list of those Students who have not been
     * assigned an Elective.
     */
    public ArrayList<Student> studentsWithoutElectives() {
        /* to be implemented in part (c) */
        ArrayList<Student> noElective = new ArrayList<Student>() ;
        for(Student student:this.studentList){
            if(!student.hasElective()){
                noElective.add(student);
            }
        }
        return noElective;
    }

    // Constructors, other methods, and private data not shown
}
