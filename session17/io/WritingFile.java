package session17.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.*;

public class WritingFile {
    private FileWriter fileWriter;

    public void writeChar(String path, String text) throws IOException {
        try (FileWriter fw = new  FileWriter(path, true)){
            for (char c : text.toCharArray()) {
                fw.write(c);
            }
        }
    }

    public void writeLine(String path, String text) throws IOException {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)))) {
            pw.println(text);
        }
    }

    public void writeFileLine(String path, String text) throws IOException {
        Files.writeString(Paths.get(path), text, APPEND);
    }
}
