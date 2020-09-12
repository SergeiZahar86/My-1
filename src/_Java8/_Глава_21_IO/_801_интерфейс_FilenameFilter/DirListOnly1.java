package _Java8._Глава_21_IO._801_интерфейс_FilenameFilter;
import java.io.File;
import java.io.FilenameFilter;
public class DirListOnly1 {
    public static void main (String[] args) {
        String dirname = "C://Program Files/Java/jdk-14.0.1/bin";
    }
}
class OnlyExt1 implements FilenameFilter {
    String ext;
    OnlyExt1 (String ext) {
        this.ext = ext;
    }
    @Override public boolean accept (File dir, String name) {
        return false;
    }
}
