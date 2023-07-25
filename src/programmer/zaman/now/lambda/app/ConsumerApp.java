package programmer.zaman.now.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("air");
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("Hello, World!"); // Output: "HELLO, WORLD!"

    }
}
