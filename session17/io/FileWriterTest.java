package session17.io;

import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String path = "C:/gjirafa/oop/src/main/java/session17/text.out";
        WritingFile writingFile = new WritingFile();
        try {
//            writingFile.writeChar(path, "\nTung nga Girafa!");
//            writingFile.writeLine(path, "\nPershendetje...");
            writingFile.writeFileLine(path, "Hello...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
