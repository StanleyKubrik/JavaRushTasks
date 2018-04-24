package javaCore.level19.task457_lev19_lec03;

import java.io.IOException;
import java.util.Scanner;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
