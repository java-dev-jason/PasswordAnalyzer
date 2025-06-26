import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YearCheck {
	
    private static File yearsFile = new File("src/YearsList.txt");
    
    public YearCheck() {}
    
    public static boolean check(String password) throws Exception {
    	Scanner scan = new Scanner(yearsFile);
    	
    	while(scan.hasNext()) {
    		String next = scan.nextLine();
    		System.out.println(next);
    		if(password.contains(next)) {
    			scan.close();
    			return true;
    		}
    	}
    	scan.close();
		return false;
    }
}
