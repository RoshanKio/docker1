
import java.util.Random;
import java.sql.Date;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;

public class Hi {
    static public void main(String... tts) {
        System.out.println("class Hi created on "+new Date(124, 0, 19));
        System.out.println("Random number n = "+new Random().nextDouble()+", on Date = "+LocalDate.now());
        System.out.println("path = "+System.getenv("path"));
        System.out.println("PATH = "+System.getenv("PATH"));
        File f = new File("myfile.txt");
        if(!f.exists()){
            try {
            f.createNewFile();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Where is the file myfile.txt?");
        
    }
}