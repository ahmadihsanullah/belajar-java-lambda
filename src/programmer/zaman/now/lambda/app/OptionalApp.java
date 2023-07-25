package programmer.zaman.now.lambda.app;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("ahmad");;
        sayHello(null);
    }

    public static void sayHello(String name){
//        use lambda
//        Optional.ofNullable(name)
//                .map(value -> value.toUpperCase())
//                .ifPresentOrElse(
//                        ((value) -> System.out.println(value)),
//                        () -> System.out.println("Hello ") //jika null mau ngeluarin apa, sebagai pengganti valuenya
//                );

//        use method reference
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElseGet(() -> "Teman"); //kalo null kita mau ganti apa valuenya

        System.out.println("Hello " + upperName);
        //Optional<String> optionalName = Optional.ofNullable(name);
        //Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        //optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

//        if check null
//        if(name != null){
//          String upperName = name.toUpperCase();
//          System.out.println("HELLO " + upperName);
//        }
    }
}
