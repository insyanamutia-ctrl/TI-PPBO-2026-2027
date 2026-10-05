public class Latihan3 {

    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("F")) {
            return (celsius * 9 / 5) + 32;
        } else {
            return celsius;
        }
    }

    public static void main(String[] args) {
        System.out.println("25°C ke Fahrenheit: "
                + konversiSuhu(25));

        System.out.println("25°C ke Kelvin: "
                + konversiSuhu(25, "K"));

        System.out.println("25°C ke Fahrenheit: "
                + konversiSuhu(25, "F"));
    }
}