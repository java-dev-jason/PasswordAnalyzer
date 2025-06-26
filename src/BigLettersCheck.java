import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BigLettersCheck {
	private static File LetterFile = new File("src/Letters.txt");
	
	public BigLettersCheck() {}
	
	public static boolean check(String password) throws Exception {
		Scanner scan = new Scanner(LetterFile);
		while(scan.hasNext()) {
			String next = scan.nextLine();
			if(password.contains(next)) {
				scan.close();
				return true;
			}
		}
		scan.close();
		return false;
	}
}
