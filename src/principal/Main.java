package principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do usu�rio: ");
		String name = sc.nextLine();
		
		System.out.println("Seu nome �: " + name);
		
		sc.close();
	}

}
