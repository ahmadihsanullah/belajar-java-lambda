package programmer.zaman.now.lambda.app;
//Filter dan Cetak Daftar Angka Ganjil

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaFunctionExample {
    public static void main(String[] args) {
        // Membuat daftar angka
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(15);

        // Menerapkan filter menggunakan lambda Predicate
        Predicate<Integer> isOdd = integer -> integer % 2 != 0;
        List<Integer> oddNumbers = filterNumbers(numbers, isOdd);

        // Mencetak angka yang telah difilter menggunakan lambda Consumer
//        Consumer<Integer> printNumber = number -> System.out.print(number + " ");

        //impelement consumer langsung
        printNumbers(oddNumbers, integer -> System.out.print(integer + " "));
    }

    // Metode untuk memfilter daftar angka berdasarkan kondisi yang diberikan oleh Predicate
    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : numbers)
            if (condition.test(number)) {
                filteredNumbers.add(number);
            }
        return filteredNumbers;
    }

    // Metode untuk mencetak daftar angka menggunakan Consumer
    public static void printNumbers(List<Integer> numbers, Consumer<Integer> action) {
        for (int number : numbers) {
            action.accept(number);
        }
    }
}
