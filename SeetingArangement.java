public class SeetingArangement {
    public static void print2DArray(String[][] classRoom) {
        for(int r=0;r<classRoom.length;r++){
	if(r>0){
        System.out.println();
    }
        for(int c=0;c<classRoom[r].length;c++){
            System.out.print(classRoom[r][c]);
            if(c<classRoom[r].length-1){
                System.out.print(" , ");
            }
        }
    }
}
public static void main(String[] args) {
    String[][] classRoom = {{"Aarav", "Riya", "Karan"},{"Neha", "Arjun", "Priya", "Vikram"},{"Rahul", "Ananya"},{"Sanjay", "Meera"},{"Pooja", "Amit"}};
    print2DArray(classRoom);
  }
}
