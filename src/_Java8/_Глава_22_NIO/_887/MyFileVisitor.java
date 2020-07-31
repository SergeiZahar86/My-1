package _Java8._Глава_22_NIO._887;
// A simple example that uses walkFileTree( ) to display a directory tree.
// Requires JDK 7 or later.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
// Create a custom version of SimpleFileVisitor that overrides
// the visitFile( ) method.
class MyFileVisitor extends SimpleFileVisitor <Path> {
    public FileVisitResult visitFile
            (Path path, BasicFileAttributes attribs) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
class DirTreeList {
    public static void main (String args[]) {
        String dirname = "C://Users/serge/" +
                "IdeaProjects/На ноуте учёба";
        System.out.println("Directory tree starting with " +
                dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname),
                    new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }
}
