//package File_IO_Practice;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
///**
// * FileManager
// *
// * Manage files.
// * Represents an instance of a file to be worked with.
// */
//public class FileManager {
//
//    // Blog Class
//    // Person Class
//
//    String filename;
//    String directory;
//    List<String> fileData;
//
//    // Get our path info?
//    Path directoryPath; // could we move this somewhere else possibly?
//    Path filePath;
//
//    // Read a file!
//    public FileManager(String filename, String directory) {
//        this.filename = filename;
//        this.directory = directory;
//
//
//        this.directoryPath = Paths.get(directory);
//        this.filePath = Paths.get(directory, filename);
//        this.fileData = getFile();
//
//
//    }
//
//    // Create a function called getFile
//    // Return the file data
//    private List<String> getFile() {
//
//
//        // Make sure the directory exists
//        try {
//            if(Files.notExists(directoryPath)) Files.createDirectories(directoryPath);
//        } catch (IOException e) {
//            System.out.println("Error creating directories " + directoryPath.getFileName());
//            e.printStackTrace();
//        }
//
//        // Make sure the files exists
//        try {
//            if(Files.notExists(filePath)) Files.createFile(filePath);
//        } catch (IOException e) {
//            System.out.println("Error creating files " + filePath.getFileName());
//            e.printStackTrace();
//        }
//
//        // If not create them (above)
//
//        List<String> data = null;
//
//        try {
//            data = Files.readAllLines(filePath);
//        } catch (IOException e) {
//            System.out.println("Error reading files " + filePath.getFileName());
//            e.printStackTrace();
//        }
//
//        // Error Handling? added try catch around each potential IOException
//
//
//        // readAllLines -> returns a List<String>
//        return data;
//    }
//
//
//    public boolean writeFile() {
//
//        try {
//            Files.write(filePath, fileData);
//
//            } catch(IOException e) {
//            System.out.println("Trash");
//            return false;
//        }
//        return true;
//    }
//
//
//    public List<String> addLine(String string) {
//        fileData.add(string);
//        writeFile();
//        return fileData;
//    }
//
//
//    // Way to print all the lines of the file so we can see its contents quickly
//    public void printLines() {
//        for (String line : fileData) {
//            System.out.println(line);
//        }
//
//
//    }
//
//}
