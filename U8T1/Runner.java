public class Runner {
    public static void main(String[] args) {
        //part A
        String[][] seatingChart = {
            {"Abby", "Don", "George", "Kim"}, 
            {"Brian", "Elenor", "Harry", "Lenny"}, 
            {"Cathy", "Fred", "Jill", "Matt"}, 
        };

        //part B
        seatingChart[1][2] = "Paul";

        //part C
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        //part D
        String[] tempRow = seatingChart[0]; 
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;

        //print the array
        for (String[] row : seatingChart) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
        System.out.println();

        //2a
        int[][] arr1 = new int[2][3]; 
        String [][] arr2 = new String[4][2];

        //2b
        arr1[0][0] = 1; 
        arr1[0][1] = 2; 
        arr1[0][2] = 3; 
        arr1[1][0] = 4; 
        arr1[1][1] = 5; 
        arr1[1][2] = 6; 
        
        //2c
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
    
        
        for (int[] row : arr1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(); 

        for (String[] row : arr2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}