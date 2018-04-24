package javaCore.level19.task457_lev19_lec03;

import java.io.*;
import java.util.*;

public class PersonScannerAdapter implements PersonScanner {
    private Scanner fileScanner;

    public PersonScannerAdapter(Scanner fileScanner) {
        this.fileScanner = fileScanner;
    }

    @Override
    public Person read() throws IOException {

    }

    @Override
    public void close() throws IOException {
        fileScanner.close();
    }
}
