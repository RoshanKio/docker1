import java.sql.Date;
import java.util.Random;

public class Hi {
    static public void main(String ... tts) {
        System.out.println("NAME  = "+System.getenv("NAME"));
        System.out.println("Random number n = "+new Random().nextDouble()+", was generated on "+new Date(124, 0, 15));
    }
}