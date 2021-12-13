package codeinside.main.java_1;

import java.io.*;


public class Main {

    public static void main(String[] args) {
        File found = searchFile(new File("C:\\Users\\fsndr\\IdeaProjects"), "Main.java");
        assert found != null;
        System.out.println("Path to file: " + found.getAbsolutePath());
    }

    static File searchFile(File file, String search) {
        if (file.isDirectory()) {
            File[] arr = file.listFiles();
            for (File f : arr) {
                File found = searchFile(f, search);
                if (found != null)
                    return found;
            }
        } else {
            if (file.getName().equals(search)) {
                return file;
            }
        }
        return null;
    }
}
