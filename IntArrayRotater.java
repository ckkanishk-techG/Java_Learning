class IntArrayRotater {
    public static int[] rotater(int[] arrayOfIntegers){
        int sizeOfArrayOfIntegers = arrayOfIntegers.length;
        int[] rotatedArrayOfIntegers = new int[sizeOfArrayOfIntegers];
        rotatedArrayOfIntegers[0] = arrayOfIntegers[sizeOfArrayOfIntegers-1];
        for(int i = 0;i<sizeOfArrayOfIntegers-1;i++){
            rotatedArrayOfIntegers[i+1]=arrayOfIntegers[i];
        }
        return rotatedArrayOfIntegers;
    }
    public static void main(String[] args) {
        int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,10};
        for(int i:rotater(arrayOfIntegers)){
            System.out.print(i+" , ");
        }
    }
}
/*
Get no of times to rotate
Rotate the array that many times
Print the rotated array
Reduce space complexity

*/