package homework.for_while_switch_Exercises;

public class Ex_5_For {
    public static void main(String[] args) {
        final int[][] a = {
                {0},
                {1,1},
                {2,2,2},
                {3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5},

        };
        for (int i = 0; i < a.length; i++) { //equals to the row in matrix
            for (int j = 0; j < a[i].length; j++) { //equals to the column in each row.
                System.out.print(a[i][j]);
            }
            System.out.println(" "); //change line on console as row comes to end in the matrix.
        }
    }
}


