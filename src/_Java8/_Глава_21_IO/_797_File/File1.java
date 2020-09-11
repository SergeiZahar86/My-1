package _Java8._Глава_21_IO._797_File;
import java.io.File;
public class File1 {
    private static void print (String s) {
        System.out.println(s);
    }
    public static void main (String[] args) {
        File file = new File("C://Empty folder/11.txt");
        print("File Name: " + file.getName());
        print("Abs Path: " + file.getAbsolutePath());
        print("Parent: " + file.getParent());
        print(file.exists() ? "exists" : "does not exist");
        print(file.canWrite() ? "is writeable" : "is not writeable");
        print(file.canRead() ? "is readable" : "is not readable");
    }
}
