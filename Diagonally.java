public class Diagonally {
    public static int[][] createMatrix(int[][] diagonally){
        for(int rc=0;rc<diagonally.length;rc++){
            diagonally[rc][rc]=1;
        }
        return diagonally;
    }
        public static void print2DArray(int[][] array) {
        for(int r=0;r<array.length;r++){
	if(r>0){
        System.out.println();
    }
        for(int c=0;c<array[r].length;c++){
            System.out.print(array[r][c]);
            if(c<array[r].length-1){
                System.out.print(" , ");
            }
        }
    }
}
    public static void main(String[] args) {
        int[][] diagonally = new int[5][5];
        print2DArray(createMatrix(diagonally));
        
    }
}
