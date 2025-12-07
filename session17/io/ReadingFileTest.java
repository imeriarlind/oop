package session17.io;

import java.io.IOException;

public class ReadingFileTest {
    public static void main(String[] args) {
        String path = "C:/gjirafa/oop/src/main/java/session17/text.txt";
        ReadingFile reader = new ReadingFile();
        try {
//            reader.readChar(path);
//            reader.readLine(path);
//            reader.readLineNumber(path);
            reader.readAllLines(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
