package session17.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class ListFolder {
    private File folder;

    public ListFolder(String path) throws IOException {
        this.folder = new File(path);
        if(!folder.exists()) {
            throw new IOException(String.format("Folder %s does not exist", path));
        }
        if(!folder.isDirectory()) {
            throw  new IOException(String.format("Folder %s is not a directory", path));
        }
    }

    public void listFiles(String suffix) {
        listFiles(folder, suffix, "");
    }

    private void listFiles(File folder, String suffix, String indent) {
        File[] files = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(suffix.toLowerCase());
            }
        });

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(indent + "[DIR] " + file.getName());
                listFiles(file, suffix, indent + "\t");
            } else {
                System.out.println(indent + file.getName());
            }
        }
    }

    public static void listRoots() {
        File[] roots = File.listRoots();
        System.out.println("File System Roots:");
        for (File root : roots) {
            System.out.println(root.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
//        ListFolder.listRoots();

        try {
            ListFolder listFolder = new ListFolder("C:\\gjirafa\\oop");
            listFolder.listFiles("java");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
