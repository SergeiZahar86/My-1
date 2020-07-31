package _Java8._Глава_22_NIO._867;
// Use Channel I/O to read a file. Requires JDK 7 or later.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelRead {
    public static void main (String args[]) {
        int count;
        Path filepath;
        // First, obtain a path to the file.сначала получить путь к файлу
        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }
        // затем получить канал к этому файлу в
        // блоке оператора try с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            // Allocate a buffer. выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                // Read a buffer.
                count = fChan.read(mBuf);
                // Stop when end of file is reached.
                if (count != -1) {
                    // Rewind the buffer so that it can be read
                    // . подготовить буфер к чтению из него данных
                    mBuf.rewind();
                    // Read bytes from the buffer and show
                    // them on the screen as characters
                    // . читать байты данных из буфера и
                    // выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            }
            while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
