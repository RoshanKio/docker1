import java.sql.Date;
import java.util.Random;

public class Hi {
    static public void main(String... tts) {
        System.out.println("PATH = "+System.getenv("PATH"));
        System.out.println("Random number n = "+new Random().nextDouble()+", generated on "+new Date(124, 0, 14));
    }
}