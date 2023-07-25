package programmer.zaman.now.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = value -> value.length();
        System.out.println(function.apply("ahmad"));

        Function<String, Boolean> booleanFunction = s -> s.length() > 5;
        System.out.println(booleanFunction.apply("eko"));
        System.out.println(booleanFunction.apply("airaoa"));


        Function<Integer, String> intToString = (num) -> Integer.toString(num);
        String result = intToString.apply(42); // Output: "42"
        System.out.println(result);

        Function<String, Integer> stringToInt = (num) -> Integer.valueOf(num);
        Integer result2 = stringToInt.apply("42"); // Output: 42
        System.out.println(result2);

    }
}
