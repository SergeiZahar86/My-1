package _Java8._Глава_22_NIO._870;
// Use a mapped file to read a file. Requires JDK 7 or later.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class MappedChannelRead {
    public static void main (String args[]) {
        // Obtain a channel to a file within a try-with-resources block.
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel
                             (Paths.get("test.txt"))) {
            // Get the size of the file.
            long fSize = fChan.size();
            // а теперь отобразить файл в буфер
            MappedByteBuffer mBuf = fChan.map
                    (FileChannel.MapMode.READ_ONLY, 0, fSize);
            // читать байты из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
