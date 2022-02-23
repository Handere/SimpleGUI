package simpleGUI.io;

import java.util.HashMap;

public class FileReader {


    public HashMap<String, Object> readJsonFile(String filePath) {
        /*
         * Read the content of the specified json file, and return it as an HashMap<String, Object>.
         *
         */
        return new HashMap<>();
    }

    public HashMap<String, Object> readCSVFile(String filePath){
        /*
         * Read the content of the specified CSV file, and return it as an HashMap<String, Object>.
         *
         */
        return new HashMap<>();
    }

    public void writeJsonFile(String filePath, Object object){
        /*
         * Write the content of the object to the specified json file, by appending it to the end of the file.
         *
         */
    }
    public void writeJsonFile(String filePath, Object object, boolean append){
        /*
         * Write the content of the object to the specified json file.
         * If append is set to true; the content will be appended to the end of the file.
         * If append is set to false; the file will be overwritten by the content.
         */
    }

    public void writeCSVFile(String filepath, Object object){
        /*
         * Write the content of the object to the specified CSV file, by appending it to the end of the file.
         *
        */
    }
    public void writeCSVFile(String filepath, Object object, boolean append){
        /*
         * Write the content of the object to the specified CSV file.
         * If append is set to true; the content will be appended to the end of the file
         * If append is set to false; the file will be overwritten by the content.
        */
    }
}
