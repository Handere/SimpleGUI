package simpleGUI.io;

import java.util.HashMap;

/**
 * The file reader.
 */
public class FileReader {

    /**
     * Create a file reader.
     */
    public FileReader() {
    }

    /**
     * Read a JSON file.
     * @param filePath The filepath to the desired file.
     * @return The content as a HashMap.
     */
    public HashMap<String, Object> readJsonFile(String filePath) {
        return new HashMap<>();
    }

    /**
     * Read a CSV file.
     * @param filePath The filepath to the desired file.
     * @return The content as a HashMap.
     */
    public HashMap<String, Object> readCSVFile(String filePath){
        return new HashMap<>();
    }

    /**
     * Overwrite a JSON file. Creating a new file if the file does not exist.
     * @param filePath The filepath to the desired file.
     * @param object The content to be written.
     */
    public void writeJsonFile(String filePath, Object object){

    }

    /**
     * Write a JSON file. Creating a new file if the file does not exist.
     * @param filePath The filepath to the desired file.
     * @param object The content to be written.
     * @param append Append the content to the file if true. Overwrite if false.
     */
    public void writeJsonFile(String filePath, Object object, boolean append){

    }

    /**
     * Overwrite a CSV file. Creating a new file if the file does not exist.
     * @param filepath The filepath to the desired file.
     * @param object The content to be written.
     */
    public void writeCSVFile(String filepath, Object object){

    }

    /**
     * Write a CSV file. Creating a new file if the file does not exist.
     * @param filepath The filepath to the desired file.
     * @param object The content to be written.
     * @param append Append the content to the file if true. Overwrite if false.
     */
    public void writeCSVFile(String filepath, Object object, boolean append){

    }
}
