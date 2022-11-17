import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Main {

    public static void main(String args[]) {

        try {
            FileWriter writer = new FileWriter("File.txt");
            LocalDateTime today = LocalDateTime.now();
            writer.write(String.valueOf(today));
            writer.close();
            Path path = Paths.get("File.txt");
            if (path.toFile().isFile()){
                System.out.println("File existing");
            }else System.out.println("File created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}