package _Java8._Глава_22_NIO._877;

/* Эта программа выводит текстовый файл, используя код
потокового ввода-вывода на основе системы N10.
Чтобы воспользоваться этой  программой,  укажите имя
 файла, который требуется
просмотреть. Например,  чтобы просмотреть файл  TEST.TXT,
 введите в режиме командной
строки следующую команду:
java ShowFile TEST.TXT
*/
import java.io.*;
import java.nio.file.*;
class ShowFile {
    public static void main (String args[]) {
        int i;
        // First, confirm that a file name has been specified.
        // Open the file and obtain a stream linked to it.
        try (InputStream fin = Files.newInputStream
                (Paths.get("test1.txt"))) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
