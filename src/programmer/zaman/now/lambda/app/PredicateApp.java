package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isBlank() ;
        boolean result = predicate.test("");
        System.out.println(result);
        System.out.println(predicate.test(""));
        System.out.println(predicate.test(" "));
        System.out.println(predicate.test("ahmad"));
//
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        boolean result2 = isEven.test(5); // Output: true
        System.out.println(result2);

        for(int i = 1; i <= 100 ; i++){
            System.out.println(isEven.test(i));
        }
    }
}
