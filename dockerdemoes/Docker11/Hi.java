import java.util.Random;
import java.sql.Date;

public class Hi {
    static public void main(String ...tts) {
        System.out.println("path = "+System.getenv("path"));
        System.out.println("Random number, n = "+new Random().nextDouble()+", was generated on "+new Date(124, 0, 16));

        System.out.println("\n\n===================Star Pattern :========================]n");

        for(int i= 1; i <= 2; i++) {
            String str = "";
            for(int j = 1; j <= 11; j++) {
                str = str+"*";
                System.out.println(str);
            }
        }
        System.out.println("**\n**\n**\n**\n**\n**\n**\n");


    }
}