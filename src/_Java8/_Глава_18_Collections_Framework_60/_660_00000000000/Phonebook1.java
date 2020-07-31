package _Java8._Глава_18_Collections_Framework_60._660_00000000000;
import java.io.*;
import java.util.Properties;
public class Phonebook1 {
    public static void main (String[] args) {
        String name, number;
        boolean changet = false;
        FileInputStream fileInputStream = null;
        Properties hp = new Properties();
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            fileInputStream = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if(fileInputStream !=null){
                hp.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
