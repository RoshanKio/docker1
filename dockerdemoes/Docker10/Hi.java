import java.util.Random;
import java.sql.Date;

public class Hi {
    static public void main(String ...tts) {
        System.out.println("NAME  = "+System.getenv("NAME"));
        System.out.println("Date = "+new Date(124, 0, 16));
        System.out.println("Random Number n = "+new Random().nextDouble());
    }
}