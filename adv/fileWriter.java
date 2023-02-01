import java.time.Instant;
import java.nio.file.*;

public class fileWriter {
    public static void main(String[] args) throws Exception {
        String time = String.valueOf(Instant.now().toEpochMilli());

        // Assigning the content of the file
        String text = "just testing the file content of the file\nOn another note the time is:- " + time;
 
        // Defining the file name of the file
        Path fileName = Path.of("testFile.txt");
 
        // Writing into the file
        Files.writeString(fileName, text);
 
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
    }
}
