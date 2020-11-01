import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Path path = Paths.get("src","test","resources","framework.properties");
        try {
            List<String> strings = Files.readAllLines(path);
            for (String st: strings){
                System.out.println(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
