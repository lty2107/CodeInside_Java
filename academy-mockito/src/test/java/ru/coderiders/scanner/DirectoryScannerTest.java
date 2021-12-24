package ru.coderiders.scanner;

import org.junit.Test;
import org.mockito.InjectMocks;
import ru.coderiders.matcher.FileMatcher;

import java.io.File;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DirectoryScannerTest {

    private Path directory = mock(Path.class);
    private FileMatcher matcher = mock(FileMatcher.class);

    @InjectMocks
    DirectoryScanner directoryScanner = new DirectoryScanner(directory, matcher, false);

    @Test
    public void throwsExceptionDirectoryNotExist(){
        when(directory.toFile()).thenReturn(new File("new_file.pdf"));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> directoryScanner.scan());
        assertEquals("Directory is not exists: " + directory, exception.getMessage());
    }

}
