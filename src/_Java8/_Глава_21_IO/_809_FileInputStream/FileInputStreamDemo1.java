package _Java8._Глава_21_IO._809_FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamDemo1 {
    public static void main (String[] args) {
        int size;
        // Для автоматического закрытия потока ввода
        //используется оператор try с ресурсами
        try (FileInputStream f = new FileInputStream("C://Users/Sergei/IdeaProjects/" +
                "My-1/file1.txt")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
