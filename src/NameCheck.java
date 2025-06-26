import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameCheck {
	static File nameList = new File("src/Namelist.txt");
	
	public NameCheck(){
		
	}
	
	public static boolean start(String password) throws Exception {
		Scanner scan = new Scanner(nameList);
		while(scan.hasNext()) {
			String scannerNext = scan.nextLine();
			if (scannerNext.isEmpty() || scannerNext.length() < 3) continue;
			System.out.println(scannerNext);
			if(password.toLowerCase().contains(scannerNext.toLowerCase())){
				scan.close();
				return true;
			}
		}
		scan.close();
		return false;
	}
}
