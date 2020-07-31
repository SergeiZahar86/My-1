package _Java8._Глава_22_NIO._872;
// Write to a file using NIO. Requires JDK 7 or later.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelWrite {
    public static void main (String args[]) {
        // Obtain a channel to a file within a try-with-resources block
        // . получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("test1.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {
            // Create a buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            // Write some bytes to the buffer.
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));
            // Reset the buffer so that it can be written.
            mBuf.rewind();
            // Write the buffer to the output file.
            fChan.write(mBuf);
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
            System.exit(1);
        }
    }
}
