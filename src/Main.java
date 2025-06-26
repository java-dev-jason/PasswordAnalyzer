import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		System.out.print("Password: ");
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		int rating = 3;
				
		boolean nameFound = NameCheck.start(password);
		boolean dudenFound = DudenCheck.Check(password);
		boolean yearFound = YearCheck.check(password);
		boolean characterFound = CharacterCheck.check(password);
		boolean bigLettersFound = BigLettersCheck.check(password);

		System.out.println("Name Found: " + nameFound);
		
		System.out.println("Found in Duden: " + dudenFound);
		
		System.out.println("Found Year: " + yearFound);
		
		System.out.println("Has Special Character: " + characterFound);
		
		System.out.println("Has big Letters: " + bigLettersFound);
		
		if(nameFound) {
			rating--;
		}
		if(dudenFound) {
			rating--;
		}
		if(yearFound) {
			rating--;
		}
		if(characterFound) {
			rating++;
		}
		if(bigLettersFound) {
			rating++;
		}
		
		System.out.println("Your password is a: " + rating + "/5");
	}

}
