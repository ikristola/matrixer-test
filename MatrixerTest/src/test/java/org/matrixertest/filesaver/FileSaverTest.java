package org.matrixertest.filesaver;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileSaverTest {

    @Test
    void testSaveText() {
        FileSaver fileSaver = new FileSaver();
        Path path = fileSaver.saveSomeText("testfile");
        assertTrue(path.toFile().exists());
    }
}