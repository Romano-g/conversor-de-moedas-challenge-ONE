package models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Request {
	private String iso;
	private URI uri;
	Calculations calculations = new Calculations();

	Gson gson = new GsonBuilder().
			setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).
			create();

	public void currencyConverter(int option) {

		isoSwitchCase(option);

		this.uri = URI.create(
				"https://v6.exchangerate-api.com/v6/" +
						"ffdd45b76deacacc0bf10f02/latest/" + iso);

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(this.uri)
				.build();

		try {
			HttpResponse<String> response = client
					.send(request, HttpResponse.BodyHandlers.ofString());

			String rawJson = response.body();

			Currency formattedJson = gson.fromJson(rawJson, Currency.class);
			CurrencyClass jsonCurrency = new CurrencyClass(formattedJson);


			calculations.calculate(jsonCurrency, option);

		} catch (IOException | InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	private String isoSwitchCase (int option) {
		return switch (option) {
			case 1, 2 -> iso = "ARS";
			case 3, 4 -> iso = "BOB";
			case 5, 6 -> iso = "CLP";
			case 7, 8 -> iso = "COP";
			case 9, 10 -> iso = "USD";
			default -> {
				System.out.println("Encerrando.");
				iso = "BRL";
				yield null;
			}
		};
	}
}
