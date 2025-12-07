package session17.io;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {
    public static void main(String[] args) {
        String path = "C:\\gjirafa\\oop\\src\\main\\java\\image.jpg";
        try {
                BufferedImage image = ImageIO.read(new File(path));
            JFrame frame = new JFrame("Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
