package _Java8._Глава_22_NIO._876;
// Copy a file using NIO. Requires JDK 7 or later.
import java.io.*;

import java.nio.file.*;
public class NIOCopy {
    public static void main (String args[]) {

        try {
            Path source = Paths.get("D://test.txt");
            Path target = Paths.get("D://Новая папка");
            // Copy the file.
            Files.copy(source, target,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
