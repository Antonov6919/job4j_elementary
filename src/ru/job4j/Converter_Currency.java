package ru.job4j;

public class Converter_Currency {
    public static int rubleToEuro(int value) {
        int rsl = value / 90;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 70; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter_Currency.rubleToEuro(2100);
        int usd = Converter_Currency.rubleToDollar(2100);
        System.out.println("2100 rubles are " + euro + " euro.");
        System.out.println("2100 rubles are " + usd + " usd.");
    }
}
