package homework.day17.censorship2.test4;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {
    @Override
    public boolean accept(File file) {
       return file.getName().endsWith(".java");
    }
}
