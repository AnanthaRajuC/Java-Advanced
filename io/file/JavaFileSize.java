package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileSize {

    public static void main(String[] args) throws IOException {
        
        Path myPath = Paths.get("src/resources/bugs.txt");
        
        long fileSize = Files.size(myPath);
        
        System.out.format("File size: %d bytes%n", fileSize);
    }
}
