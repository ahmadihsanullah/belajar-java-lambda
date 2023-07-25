package programmer.zaman.now.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Ahmad", "Ihsanullah","Rabbani");

        //menggunakan forloop
        for(var value : list) {
            System.out.println(value);
        }

        //menggunakan anonymus class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        //lambda
        list.forEach(name -> System.out.println(name));

        //lambda with method reference
        list.forEach(System.out::println);
    }
}
