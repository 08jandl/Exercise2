package fh.campus02;

public class CurrencyConversion {
    public static void main(String[] args) {
        double convertedValue1 = exchangeCurrency("HUF", 100);
        System.out.println("100 Euros convert to " + convertedValue1 + " HUF");

        double convertedValue2 = exchangeCurrencyIf("SEK", 900);
        System.out.println("900 EUR convert to " + convertedValue2 + " SEK");
    }

    public static double exchangeCurrency(String currencyID, double value) {
        double convertedValue;
        // this is a perfect opportunity for a switch
        // there are only a handful of unique possibilities
        switch (currencyID) {
            case "HUF" -> convertedValue = value * 328.61;
            case "SEK" -> convertedValue = value * 10.76;
            case "USD" -> convertedValue = value * 1.12;
            case "CAD" -> convertedValue = value * 1.47;
            default -> {
                System.out.println(currencyID + " could not be converted.");
                convertedValue = value;
            }
        }
        return convertedValue;
    }

    public static double exchangeCurrencyIf(String currencyID, double value) {
        double convertedValue;
        // if is of course also possible
        // but in this case a couple of lines longer
        if (currencyID.equals("HUF")) {
            convertedValue = value * 328.61;
        } else if (currencyID.equals("SEK")) {
            convertedValue = value * 10.76;
        } else if (currencyID.equals("USD")) {
            convertedValue = value * 1.12;
        } else if (currencyID.equals("CAD")) {
            convertedValue = value * 1.47;
        } else {
            System.out.println(currencyID + " could not be converted.");
            convertedValue = value;
        }
        return convertedValue;
    }
}
