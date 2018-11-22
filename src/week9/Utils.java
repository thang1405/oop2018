package week9;

import java.io.*;
import java.io.FileReader;
import java.io.File;
import java.lang.String;

import java.io.FileWriter;
public class Utils {

    public static String readContentFromFile(String path)
    {
        String num= new String("");
        try {

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("đọc file : "+ path);
            while ((line = br.readLine()) != null) {

                num+=line+"\n";
            }
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file : " + ex);
            ex.printStackTrace();
        }
        return num;
    }

    public static void writeContentToFile(String path)
    {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(path));
            System.out.println("ghi file : "+path);
            String s = "captain America";

            br.write(s);
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi ghi file: " + ex);
            ex.printStackTrace();
        }
    }

    public static void writeToFile(String path)
    {
        try {
            BufferedWriter bw = null;
            FileWriter fw = null;

                fw = new FileWriter(path, true);
                bw = new BufferedWriter(fw);
                String content = "spider man\n";
                bw.write(content);
                System.out.println("Ghi them noi dung file xong!");

            bw.close();
            fw.close();

        } catch (Exception ex) {
            System.out.println("Loi ghi file: " + ex);
            ex.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName)
    {
        String s = folderPath + "//" + fileName;
        File f = new File(s);
        if(f.exists()) return f;
        return null;
    }
    public static void main(String[] args)
    {
        try{
            Utils utils= new Utils();
            System.out.println(utils.readContentFromFile("src\\week9\\lv1.txt"));

            utils.writeContentToFile("src\\week9\\lv.txt");
            System.out.println(utils.readContentFromFile("src\\week9\\lv.txt"));
            utils.writeToFile("src\\week9\\lv1.txt");
            System.out.println(utils.readContentFromFile("src\\week9\\lv1.txt"));
            File f= utils.findFileByName("src\\week9","lv1.txt");
            if(f==null) System.out.println("Can't Find!!");
            else System.out.println("File find : " +f.getAbsolutePath());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
