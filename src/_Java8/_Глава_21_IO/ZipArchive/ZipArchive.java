package _Java8._Глава_21_IO.ZipArchive;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipArchive {
    public static void main (String[] args) throws IOException {
        try (ZipOutputStream output = new ZipOutputStream(
                new FileOutputStream(new File("D:/1.zip")))) {
            ZipEntry entry = new ZipEntry("TEST.txt");
            output.putNextEntry(entry);
            output.write("ABC".getBytes("UTF-8"));
            output.closeEntry();
        }
    }
}
