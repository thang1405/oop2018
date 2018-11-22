package week10;

import java.util.Random;

public class Task2 {
    double a[] = new double[1000];

    public Task2(){
        int i=0,j=0;
        for(i=0;i<1000;i++){
            Random rd= new Random();
            a[i]= rd.nextDouble();
        }
        bubbleSort(a,1000);
        for(i=0;i<1000;i++){
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(double []A, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(A[j]<A[j-1]) {
                    double temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        new Task2();
    }

}
