package week11;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public <T extends Comparable<T>> T MaxArr(ArrayList<T> arr){
        int n= arr.size();
        T max= arr.get(1);
        for(int i=1;i<n;i++){
            if(arr.get(i).compareTo(max)>0) max=arr.get(i);
        }

        return max;
    }
    public <T> void printArray(ArrayList<T> inputArray) {

        System.out.println("Array : ");
        for ( T element : inputArray ){
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> intArr=new ArrayList<Integer>();
        intArr.add(3);
        intArr.add(9);
        intArr.add(6);
        intArr.add(2);
        intArr.add(4);

        ArrayList<Character> charArr=new ArrayList<Character>();
        charArr.add('q');
        charArr.add('r');
        charArr.add('y');
        charArr.add('t');
        charArr.add('u');
        Task2 task2= new Task2();
        System.out.println("Max = "+ task2.MaxArr(intArr));
        task2.printArray(intArr);
        System.out.println("Max = "+ task2.MaxArr(charArr));
        task2.printArray(charArr);

    }
}
