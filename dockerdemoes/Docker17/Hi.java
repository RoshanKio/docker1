import java.util.Random;
import java.sql.Date;
import java.time.LocalDate;

public class Hi {
    static public void main(String... tts) {
        System.out.println("Date of creation of Hi class : "+LocalDate.now());
        System.out.println("Random number, n = "+new Random().nextDouble()+", created on "+new Date(124, 0, 18));
        System.out.println("classpath : "+System.getenv("classpath"));
        System.out.println("NAME : "+System.getenv("NAME"));
        System.out.println("Flag of USA : \n=============\n\\n\n");

        System.out.println("**\n**\n**\n**\n**");
        String str = "**************";
        for(int i = 1; i <= 10; i++) {
            System.out.println(str);

        }
    }
}