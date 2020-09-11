package _Java8._Глава_21_IO._797_File;
import java.io.File;
public class File1 {
    private static void print (String s) {
        System.out.println(s);
    }
    public static void main (String[] args) {
        //File file = new File("C://Empty folder/11.txt"); // для винды
        File file = new File("/home/sergei/Документы/11"); // для Linux
        print("File Name: " + file.getName());
        print("Abs Path: " + file.getAbsolutePath());
        print("Parent: " + file.getParent());
        print(file.exists() ? "exists" : "does not exist");
        print(file.canWrite() ? "is writeable" : "is not writeable");
        print(file.canRead() ? "is readable" : "is not readable");
        print("is " + (file.isDirectory() ? "" : "not" + " a directory"));
        print(file.isFile() ? "is normal file" : "might be a named pipe");
        print(file.isAbsolute() ? "is absolute" : "is not absolute");
        print("File last modified: " + file.lastModified());
        print("File size: " + file.length() + " Bytes");
        System.out.println();
        System.out.println();
    }
}
