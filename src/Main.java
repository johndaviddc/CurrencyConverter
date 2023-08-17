public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("US Dollar", "$");
        Currency eur = new Currency("Euro", "€");
        // Add more currencies as needed

        Currency[] currencies = { usd, eur };

        CurrencyConverter converter = new CurrencyConverter(currencies);

        // Set exchange rates (manually for this example)
        converter.setExchangeRate(0, 1, 0.85); // USD to EUR
        converter.setExchangeRate(1, 0, 1.18); // EUR to USD

        double amount = 100;
        int fromIndex = 0; // USD
        int toIndex = 1;   // EUR

        double convertedAmount = converter.convertCurrency(amount, fromIndex, toIndex);
        System.out.println(amount + " " + usd.getSymbol() + " is equal to " +
                convertedAmount + " " + eur.getSymbol());
    }
}
