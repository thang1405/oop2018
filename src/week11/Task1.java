package week11;

import java.util.SortedSet;

public class Task1 {
    public <T> void printArray(T[] inputArray) {

        for ( T element : inputArray ){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
    public <T extends Comparable<T>> void SortArray(T[] A) {
        // Display array elements
        int n=A.length;
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(A[j].compareTo(A[j-1])<=0) {
                    T temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
    }

    public static void main( String args[] ){

        Integer[] intArray = { 4, 3, 2, 1, 0 };
        Double[] doubleArray = { 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        Task1 gmt = new Task1();

        System.out.println( "Array integerArray contains:" );
        gmt.printArray( intArray );
        gmt.SortArray(intArray);
        gmt.printArray( intArray );

        System.out.println( "\nArray doubleArray contains:" );
        gmt.printArray(doubleArray);
        gmt.SortArray( doubleArray );
        gmt.printArray(doubleArray);

        System.out.println( "\nArray characterArray contains:" );
        gmt.printArray( charArray );
        gmt.SortArray(charArray);
        gmt.printArray( charArray );

    }


}
