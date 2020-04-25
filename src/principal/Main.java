package principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuário: ");
		String name = sc.nextLine();
		
		System.out.println("Seu nome é: " + name);
		
		sc.close();
	}

}
