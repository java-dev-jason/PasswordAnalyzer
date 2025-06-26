import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DudenCheck {

	private static File DudenFile = new File("src/Duden.txt");
	
	public DudenCheck(){}
	
	public static boolean Check(String password) throws Exception {
		Scanner scan = new Scanner(DudenFile);
		while(scan.hasNext()) {
			String Line = scan.nextLine();
			System.out.println(Line);
			
			if(password.toLowerCase().contains(Line.toLowerCase())) {
				scan.close();
				return true;
			}
		}
		scan.close();
		return false;
	}
}
