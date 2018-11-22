package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    List<String> getAllFunctions(File path) {

        List<String> list=new ArrayList<String>();
        try {

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("đọc file : "+ path);
            while ((line = br.readLine()) != null) {
                if(line.indexOf("static")!=-1 && !line.startsWith("//")) {
//                    String s1= line;
//                    while ( !line.startsWith("}")) {
//                        s1 += line + "\n";
//
//                    }
//                    s1+="}";
                    list.add(line);
                }

            }
            for (String s : list) {
                System.out.println("phương thức là :  ");
                System.out.println(s);
            }

            fr.close();
            br.close();

        } catch (Exception ex) {
            System.out.println("Loi doc file : " + ex);
            ex.printStackTrace();
        }
        return list;
    }

    public String findFunctionByName(String name){
        List<String> Find =getAllFunctions(new File("src\\week9\\Utils.java"));

        String find= new String(name.substring(0,name.indexOf("(")));

        int i=0;
        System.out.println("Phương thức cần tìm : ");
        for (String s : Find ) {

            if (Find.get(i).indexOf(find)!=-1) {

                return Find.get(i);
            }
            i++;
        }
        return "Can't Find";
    }

    public static void main(String[] args) {
        Task1 task1= new Task1();
        task1.getAllFunctions(new File("src\\week9\\Utils.java"));
        System.out.println(task1.findFunctionByName("findFileByName(String,String)"));
    }
}

