package models;

import java.util.HashMap;

public record Currency(String baseCode, HashMap<String, Double> conversionRates) {
}
