package com.clouway;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */

public class DirectoryBrowser {

    /**
     * Returns an array list with names of the files and subdirectories
     * of the given directory denoted by its pathname
     * @param path String path to the directory
     * @return ArrayList contains the names of all files and subdirectories
     * If path points to a file prints message "Path points to a file"
     */
    public ArrayList<String> listContent (String path) {
        ArrayList<String> list = new ArrayList<>();
        Path source = Paths.get(path);
        if (Files.isRegularFile(source)) {
            System.out.println("Path points to a file");
            return list;
        }
        if (Files.isDirectory(source)) {
            try (DirectoryStream<Path> browser = Files.newDirectoryStream(source)) {
                for (Path path1 : browser) {
                    list.add(path1.getFileName().toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
