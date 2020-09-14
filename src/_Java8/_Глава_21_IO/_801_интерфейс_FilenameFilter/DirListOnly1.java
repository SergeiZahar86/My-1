package _Java8._Глава_21_IO._801_интерфейс_FilenameFilter;
import java.io.File;
import java.io.FilenameFilter;
public class DirListOnly1 {
    public static void main (String[] args) {
        String dirname = "C://Program Files/Java/jdk-11.0.8/bin";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("exe");
        String[] s = f1.list(only);
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
class OnlyExt1 implements FilenameFilter {
    String ext;
    OnlyExt1 (String ext) {
        this.ext = ext;
    }
    @Override public boolean accept (File dir, String name) {
        return name.endsWith(ext);
    }
}
