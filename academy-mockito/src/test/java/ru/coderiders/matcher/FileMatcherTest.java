package ru.coderiders.matcher;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;


public class FileMatcherTest {

    private File file = mock(File.class);

    @InjectMocks
    private FileMatcher fileMatcher = new PictureMatcher();

    @Test
    public void throwsExceptionIsFileNotExits(){
        when(file.exists()).thenReturn(false);
        when(file.getName()).thenReturn("Name");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> fileMatcher.match(file));
        assertEquals("File not exists: Name", exception.getMessage());
    }

    @Test
    public void isFileIsDirectory(){
        when(file.exists()).thenReturn(true);
        when(file.isDirectory()).thenReturn(true);
        assertFalse(fileMatcher.match(file));
    }

    @Test
    public void isMatchIsSucces(){
        when(file.exists()).thenReturn(true);
        when(file.isDirectory()).thenReturn(false);
        when(file.getName()).thenReturn("img.png");
        assertTrue(fileMatcher.match(file));
    }

}
