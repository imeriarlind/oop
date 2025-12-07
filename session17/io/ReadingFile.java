package session17.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFile {
    public void readChar(String path) throws IOException {
        try (FileReader fr = new FileReader(path)) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }

    public void readLine(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line;

            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
    }

    public void readLineNumber(String path) throws IOException {
        try(LineNumberReader br = new LineNumberReader(new FileReader(path)))
        {
            String line;

            while((line = br.readLine()) != null)
            {
                System.out.printf("%d:%s%n", br.getLineNumber(), line);
            }
        }
    }

    public void readAllLines(String path) throws IOException {
        Path filePath = Paths.get(path);
        System.out.println(filePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(filePath);
        lines.stream().forEach(System.out::println);
    }
}
