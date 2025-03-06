package U8T2;
public class Main {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        
        System.out.println("---------");
        // write code below that uses nested ENHANCED for loops
        // to print each element in nums in ROW-MAJOR order again;
        // print all the numbers in a row on the same line
        // with a space in between
        
        for (int[] row : nums) { 
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
        
        // now, write code below that uses nested INDEX-BASED for loops
        // to print each element in nums in ROW-MAJOR order;
        // print all the numbers in a row on the same line
        // with a space in between
        
        for (int row = 0; row < nums.length; row++) { 
            for (int columm = 0; columm < nums[0].length; columm++ ) {
                System.out.print(nums[row][columm] + " ");
            }
            System.out.println();
        }
        
        System.out.println("---------");
        // finally, write code below that uses nested for loops
        // to print each element in nums in COLUMN-MAJOR order;
        // print all the numbers in a COLUMN on the same line
        // with a space in between
        
        for (int columm = 0; columm < nums[0].length; columm++) { 
            for (int row = 0; row < nums.length; row++) {
                System.out.print(nums[row][columm] + " ");
            }
            System.out.println();
        }
        
        
        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");
        
        String[][] animals = {
                {"anteater", "bird"},
                {"camel", "dog"},
                {"elephant", "giraffe"},
                {"hyena", "jackal"}
        };
        // write code below using a nested loop to update each element
        // in animals to its plural form, e.g. bird --> birds;
        // (no printing yet)
        for (int row = 0; row < animals.length; row++) { 
            for (int columm = 0; columm < animals[0].length; columm++ ) {
                animals[row][columm] = animals[row][columm] + "s";
            }
        }
       
        // next, write code below to print out the 2D
        // array in column-major order, showing each
        // animal in inside a bracketed "enclosure"
        // using "|" (like fences separating animal pens
        // in a zoo)
        
        for (int columm = 0; columm < animals[0].length; columm++) { 
            System.out.print("|");
            for (int row = 0; row < animals.length; row++) {
                System.out.print(animals[row][columm] + "|");
            }
            System.out.println();
        }        
    }
}