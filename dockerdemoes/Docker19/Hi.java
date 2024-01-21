
import java.sql.Date;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hi {
    static public void main(String ... tts) {
        System.out.println("Date of creation : "+new Date(124, 0, 20));
        System.out.println("Today is "+LocalDate.now());
        System.out.println("PATH : "+System.getenv("PATH"));
        Properties p = new Properties();
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("propertiesfile");
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.load(fileReader);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("name : "+p.getProperty("name"));
        System.out.println("address : "+p.getProperty("address"));


    }

}