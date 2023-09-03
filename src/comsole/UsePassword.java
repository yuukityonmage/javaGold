package comsole;

import java.io.Console;

public class UsePassword {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("入力：");
//		char[] password = console.readPassword();
		String password = console.readLine();
		System.out.println(String.valueOf(password));
	}

}
