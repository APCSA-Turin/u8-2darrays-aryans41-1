import java.util.Arrays;
public class FunWith2DArrays {
    
    public static int totalElements(int[][] int2DArray) {
       int numOfRows = int2DArray.length; 
       int numOfColumms = int2DArray[0].length;
       return numOfRows * numOfColumms;
    }

    public static void fourCorners(String[][] String2DArray) {
        int numOfRows = String2DArray.length;
        int numOfColumms = String2DArray[0].length;
        System.out.println(String2DArray[0][0]); //top left 
        System.out.println(String2DArray[0][numOfColumms - 1]); //top right
        System.out.println(String2DArray[numOfRows - 1][0]); //bottom left
        System.out.println(String2DArray[numOfRows - 1][numOfColumms - 1]); //bottom right
    }

    public static void swapFrontAndBackRows(String[][] String2DArray) {
        int rows = String2DArray.length; 
        String[] temp = String2DArray[0];
        String2DArray[0] = String2DArray[rows - 1];
        String2DArray[rows - 1] = temp;
    }

    public static double average (int[][] ints2D) {
        int numOfRows = ints2D.length; 
        int numOfColumms = ints2D[0].length;
        int totalElements = numOfRows * numOfColumms;
        double total = 0;
        for (int[] row : ints2D) { 
            for (int element: row) {
                total += element;
            }
        }
        return total/totalElements;
    }

    public static int edgeSum(int[][] ints2D) {
        int numOfRows = ints2D.length; 
        int numOfColumms = ints2D[0].length;
        int sum = 0; 
        //top row
        for (int element : ints2D[0]) {
            sum += element;
        }
        //bottom row
        for (int element : ints2D[numOfRows - 1]) {
            sum += element;
        }
        //left and right
        for (int i = 1; i < numOfRows - 1; i++) {
            sum += ints2D[i][0];
        }
        for (int i = 1; i < numOfRows - 1; i++) {
            sum += ints2D[i][numOfColumms - 1];
        }
        return sum;
    }

    public static int[] indexFound (String[][] string2D, String target) {
        int[] indexFound = new int[2]; 
        for (int columm = 0; columm < string2D[0].length; columm++) { 
            for (int row = 0; row < string2D.length; row++) {
                if(string2D[row][columm].equals(target)) {
                    indexFound[0] = row;
                    indexFound[1] = columm;
                    return indexFound;
                }
            }
        }
        indexFound[0] = -1;
        indexFound[1] = -1; 
        return indexFound;
    }

    public static int[][] split(int[][] array, int rowNumber, int colummNumber) {
        if (rowNumber >= array.length || colummNumber >= array[0].length) {
            int[][] returnArray = new int[0][0]; 
            return returnArray;
        }
        int[][] splitArray = new int[rowNumber + 1][colummNumber + 1]; 
        for (int row = 0; row <= rowNumber; row++) {
            for  (int columm = 0; columm <= colummNumber; columm++) {
                splitArray[row][columm] = array[row][columm];
            }
        }
        return splitArray;
    }

    public static int[][] invert(int[][] array) {
        int[][] inverted = new int[array[0].length][array.length];
        for (int row = 0; row < array.length; row++) {
            for (int columm = 0; columm < array[0].length; columm++) {
                int num = array[row][columm]; 
                inverted[columm][row] = num;
            }
        }
        return inverted;
    }
}