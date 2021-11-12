package lessons.lesson21.newFilesCreation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFilesCreation {

    public static void main(String[] args) {
        File newFile = new File("myOutput.txt");

        try {
            newFile.createNewFile();
        } catch (Exception e) {
            System.out.println("File does not exist");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myOutputSecond.txt"));
            writer.write("This is a new line to append to the file."); // >
            writer.append("This is something new."); // >>
            writer.close();
        } catch (IOException e) {
            System.out.println("File does not exist.");
        }
    }
}
