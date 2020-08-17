package clasa.algorithms.src.com.lseg.arrays;

public class rotLeft {
    public static void main(String[] args) {
        //Initialize array
        int[] a = new int[]{6, 2, 4, 8, 98};
        //d determine the number of times an array should be rotated
        int d = 1;
        //Displays original array
        System.out.println("Original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("n=" + a.length + " d=" + d);
        //Rotate the given array by d times toward left
        for (int i = 0; i < d; i++) {
            int j, first;
            //Stores the first element of the array
            first = a[0];
            for (j = 0; j < a.length - 1; j++) {
                //Shift element of array by one
                a[j] = a[j + 1];
            }
            //First element of array will be added to the end
            a[j] = first;
        }
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
