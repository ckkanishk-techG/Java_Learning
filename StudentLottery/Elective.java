package StudentLottery;

public class Elective {

    /**
     * Postcondition: Returns the name of this Elective.
     */
    public String getName() {
        /* code not shown */
        return null;
    }

    /**
     * Postcondition: Returns the maximum number of Students
     * that can be added to this Elective.
     */
    public int getMaxClassSize() {
        /* code not shown */
        return 0;
    }

    /**
     * Postcondition: Returns the number of Students that have been
     * added to this Elective.
     *               0 <= getClassSize() <= getMaxClassSize()
     */
    public int getClassSize() {
        /* code not shown */
        return 0;
    }

    /**
     * Precondition: getClassSize() < getMaxClassSize(); s is not null
     * Postcondition: Student s has been added to this Elective;
     *                getClassSize() has increased by 1.
     */
    public void addStudent(Student s) {
        /* code not shown */
    }

    // Constructors, other methods, and private data not shown
}
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