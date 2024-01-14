import java.sql.Date;
import java.util.Random;

public class Hi {
    public static void main(String tts[]) {
        System.out.println("path = "+System.getenv("path"));
        System.out.println("Random numer, n = "+new Random().nextDouble()+" generated on "+new Date(124, 0, 13));
    }
}