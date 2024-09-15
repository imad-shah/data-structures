package chapter1;
import java.util.ArrayList;

public class AverageArrayTester
{
    public static void main(String[] args)
    {
        Country[] countries = {
                new Country("Uruguay", 176220),
                new Country("Thailand", 513120),
                new Country("Belgium", 30510),
                new Country("Luxembourg", 2586),
                new Country("Denmark", 43094)
        };
        System.out.printf("%,.0f%n", Utils.average(countries));
        System.out.println("Expected: 153,106");
    }
}