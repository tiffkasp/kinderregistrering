package co.za.kruisweg.kinderregistreering.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {

    public static List<String> getFolderNames(String folderPath) {
        try {
            // Create a Path object for the folder
            Path path = Paths.get(folderPath);

            // List all directories (folders) inside the folder
            return Files.list(path)
                    .filter(Files::isDirectory)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error getting folder names: " + e.getMessage());
            return null;
        }
    }

}
