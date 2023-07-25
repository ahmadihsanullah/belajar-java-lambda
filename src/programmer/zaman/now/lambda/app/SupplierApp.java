package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "ahmad ihsan";

        String name = supplier.get();
        System.out.println(name);

        Supplier<Double> getRandomNumber = () -> Math.random();
        double result = getRandomNumber.get(); // Output: nilai random antara 0 dan 1
        System.out.println(result);
    }
}
