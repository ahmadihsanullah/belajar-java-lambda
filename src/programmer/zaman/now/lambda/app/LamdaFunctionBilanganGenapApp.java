package programmer.zaman.now.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaFunctionBilanganGenapApp {
    public static void main(String[] args) {
        // Membuat daftar angka
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(List.of(1, 2, 3,4,5,6,7,22,21, 28));

        //melakukan filter menggunakan predicate
        Predicate<Integer> isOdd = value -> value % 2 == 0;
        List<Integer> oddNumbers = filterGenap(list, isOdd);

        //mencetak angka menggunakan lambda consumer
        printNumbers(oddNumbers, (angka)-> System.out.println(angka));

    }

    // Metode untuk memfilter daftar angka berdasarkan kondisi yang diberikan oleh Predicate
    public static List<Integer> filterGenap(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> value = new ArrayList<>();
        for(int number : numbers){
                if (predicate.test(number)) {
                value.add(number);
            }
        }
        return value;
    }

//    metode untuk mencetak bilangan genap menggunakan lambda consumer
    public static void printNumbers(List<Integer> list, Consumer<Integer> consumer){
        for(var angka : list){
            consumer.accept(angka);
        };
    }
}
