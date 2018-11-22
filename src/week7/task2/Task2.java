package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    private static String getString() {
        return null;
    }
    public void readfile(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        }
        catch (FileNotFoundException e){// lỗi ko tìm thấy file
            System.out.println("Error!! File Not Found..");
            //e.printStackTrace();
        }
        catch (IOException e){// lỗi không đọc đc file
            System.out.println("Error!! Can't read file..");
            //e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        String s = getString();
        try {
            int length = s.length();
        }
        catch (NullPointerException e){// e là con trỏ null
            System.out.println("Error!! NullPoint..");
            //e.printStackTrace();
        }

        String[] str = new String[]{"1","2","3"};
        try{
            String s1 = str[6];
            System.out.println("s1 ="+s1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error!! Array Index Out Of Bounds..");
            //e.printStackTrace();
        }

        try{
            int k = 10/0;
        }
        catch (ArithmeticException e){// lỗi chia cho 0-
            System.out.println("Error!! Can't division with 0..");
            //e.printStackTrace();
        }
        try{
            long i =2;
            int k = (int) i;
        }
        catch (ClassCastException e){// lỗi ép kiểu
            System.out.println("Error!!Class Cast..");
            //e.printStackTrace();
        }
        Task2 e = new Task2();
        e.readfile();
        Task2 t = new Task2();
        t.readfile();

    }
}
