package models;

import java.util.Scanner;

public class Calculations {
	private Scanner scanner = new Scanner(System.in);
	private double value;
	private int option;

	private String formatter (CurrencyClass jsonCurrency, double value) {
		return jsonCurrency.df.format(value);
	}

	private String entryMessage (String currency1, String currency2) {
		return "\nDigite um valor em " + currency1 +
				" para converter em " + currency2;
	}

	private double scan () {
		return value = scanner.nextDouble();
	}

	private String responseMessage (
			CurrencyClass json, String currencyName1, String currencyName2,
			double option) {
		if (option % 2 == 0) {
			return "\n" + formatter(json, value) + " " + currencyName1 + " = " +
					formatter(json, (value / json.getValueInBrl())) + " " +
					currencyName2;
		} else {
			return "\n" + formatter(json, value) + " " + currencyName1 + " = " +
					formatter(json, (value * json.getValueInBrl())) + " " +
					currencyName2;
		}
	}

	public void calculate (CurrencyClass json, int option) {
		switch (option) {
			case 1:
				System.out.println(entryMessage("Pesos Argentinos", "Reais"));
				scan();

				System.out.println(responseMessage(
						json, "Pesos Argentinos",
						"Reais", option));
				break;

			case 2:
				System.out.println(entryMessage("Reais", "Pesos Argentinos"));
				scan();

				System.out.println(responseMessage(
						json, "Reais",
						"Pesos Argentinos", option));
				break;

			case 3:
				System.out.println(entryMessage("Bolivianos", "Reais"));
				scan();

				System.out.println(responseMessage(
						json, "Bolivianos",
						"Reais", option));
				break;

			case 4:
				System.out.println(entryMessage("Reais", "Bolivianos"));
				scan();

				System.out.println(responseMessage(
						json, "Reais",
						"Bolivianos", option));
				break;

			case 5:
				System.out.println(entryMessage("Pesos Chilenos", "Reais"));
				scan();

				System.out.println(responseMessage(
						json, "Pesos Chilenos",
						"Reais", option));
				break;

			case 6:
				System.out.println(entryMessage("Reais", "Pesos Chilenos"));
				scan();

				System.out.println(responseMessage(
						json, "Reais",
						"Pesos Chilenos", option));
				break;

			case 7:
				System.out.println(entryMessage("Pesos Colombianos", "Reais"));
				scan();

				System.out.println(responseMessage(
						json, "Pesos Colombianos",
						"Reais", option));
				break;

			case 8:
				System.out.println(entryMessage("Reais", "Pesos Colombianos"));
				scan();

				System.out.println(responseMessage(
						json, "Reais",
						"Pesos Colombianos", option));
				break;

			case 9:
				System.out.println(entryMessage("Dólares", "Reais"));
				scan();

				System.out.println(responseMessage(
						json, "Dólares",
						"Reais", option));
				break;

			case 10:
				System.out.println(entryMessage("Reais", "Dólares"));
				scan();

				System.out.println(responseMessage(
						json, "Reais",
						"Dólares", option));
				break;
		}
	}
}
