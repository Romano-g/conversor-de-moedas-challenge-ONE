import models.Request;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Request request = new Request();
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 11) {
			System.out.println("""
					\n---------------------------------------------------------
					Selecione uma das opções:
					
					1  => Converter Pesos Argentinos para Reais.
					2  => Converter Reais para Pesos Argentinos.
					3  => Converter Bolivianos para Reais.
					4  => Converter Reais para Bolivianos.
					5  => Converter Pesos Chilenos para Reais.
					6  => Converter Reais para Pesos Chilenos.
					7  => Converter Pesos Colombianos para Reais.
					8  => Converter Reais para Pesos Colombianos.
					9  => Converter Dólares para Reais.
					10 => Converter Reais para Dólares.
					11 => Sair.
					---------------------------------------------------------
					""");
			option = scanner.nextInt();
			request.currencyConverter(option);
		}
	}
}
