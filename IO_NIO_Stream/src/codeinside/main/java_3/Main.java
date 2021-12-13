package codeinside.main.java_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Long mismatch = giveDifferentFiles_thenShouldFindMismatch("1.txt", "2.txt");
        System.out.println("Different byte: " + mismatch);
    }

    private static Long giveDifferentFiles_thenShouldFindMismatch(String firstFileName, String secondFileName) throws IOException {
        File firstFile = new File(firstFileName);
        File secondFile = new File(secondFileName);

        Path firstFilePath = Path.of(firstFile.getAbsolutePath());
        Path secondFilePath = Path.of(secondFile.getAbsolutePath());

        Long mismatch = Files.mismatch(firstFilePath, secondFilePath);
        if (mismatch == -1){
            return null;
        }
        else {
            return mismatch;
        }
    }

}
