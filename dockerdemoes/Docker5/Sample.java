import java.sql.Date;
import java.util.Random;

public class Sample {
	public static void main(String tts[]) {
		System.out.println("MY_NAME = "+System.getenv("MY_NAM"));
		System.out.println("Random number, n = "+new Random().nextDouble()+" was generated on "+new Date(124, 0, 13)+" by "+tts[0]);
	}
}