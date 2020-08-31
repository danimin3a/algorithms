package homework.homework2;

public class Ex_1_For {
    public static void main(String[] args) {
        int[][] a = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        };
        for (int i = 0; i < a.length; i++) { //equals to the row in matrix
            for (int j = 0; j < a[i].length; j++) { //equals to the column in each row.
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" "); //change line on console as row comes to end in the matrix.
        }
    }
}
