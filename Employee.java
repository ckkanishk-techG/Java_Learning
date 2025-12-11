public class Employee extends Person {

    private String posting;
    private int salary;
    public void doWork(){
        System.out.println(this.posting);
    }
    public void setPosting(String posting){
        this.posting = posting;
    }

    public static void main(String[] args) {
        Person employee1 = new Employee();
        Employee employeee = (Employee) employee1;
        employeee.posting = "Bob";
        employeee.doWork();
        Employee employee2 = new Employee();
        employee2.posting = "Builder";
        employee2.doWork();
        System.out.println(employee1.age);
    }
}