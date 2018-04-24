package javaCore.level19.task455_lev19_lec03;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;
    void writeString(String s) throws IOException;
    void close() throws IOException;
}
