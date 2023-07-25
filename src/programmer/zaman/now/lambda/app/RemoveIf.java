package programmer.zaman.now.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        //mutable karena data akan dihapus
        List<String> list = new ArrayList<String>();
        list.addAll(List.of("aha", "ihsan","rabbani"));

        //menggunakan for untuk menghapus data : error 'java.util.ConcurrentModificationException'
//        for (var name : list) {
//          if (name.length() > 5) {
//            list.remove(name);
//          }
//        }

        //anonymus class
//        list.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        //lambda
        list.removeIf(name -> name.length() > 5);

        //tidak bisa reference karena ada perbandingan
        System.out.println(list);
    }
}
