public class CurrencyConverter {
    private double[][] exchangeRates;
    private Currency[] currencies;

    public CurrencyConverter(Currency[] currencies) {
        this.currencies = currencies;
        int numCurrencies = currencies.length;
        exchangeRates = new double[numCurrencies][numCurrencies];
    }

    public void setExchangeRate(int fromIndex, int toIndex, double rate) {
        exchangeRates[fromIndex][toIndex] = rate;
    }

    public double convertCurrency(double amount, int fromIndex, int toIndex) {
        double exchangeRate = exchangeRates[fromIndex][toIndex];
        return amount * exchangeRate;
    }
}
