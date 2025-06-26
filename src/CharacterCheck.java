import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCheck {
	private static File characterFile = new File("src/Character.txt");
	
	public CharacterCheck() {}
	
	public static boolean check(String password) throws Exception {
		Scanner scan = new Scanner(characterFile);
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
