package Utils;
import org.fluttercode.datafactory.impl.DataFactory;

public class RandomUtils {
	
//	Random values generation to fill contact-us page
	static DataFactory df = new DataFactory();

	public static String fname = df.getFirstName();
	public static String lname = df.getLastName();
	public static String email = df.getEmailAddress();
	public static String phone = df.getNumberText(10);
	public static String website_URL = df.getRandomWord(8, 15);
	public static String company = df.getBusinessName();
	public static String message = df.getRandomText(20, 25);
	
}
