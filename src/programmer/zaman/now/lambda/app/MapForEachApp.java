package programmer.zaman.now.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name_first", "Ahmad");
        map.put("name_middle", "Ihsanullah");
        map.put("name_last", "Rabbani");

        //menggunakan forloop entryset()
        for(var name : map.entrySet()) {
            System.out.println(name.getKey() + " : " + name.getValue());
        }

        //menggunakan anonymus class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        //lambda
        map.forEach((k,v)-> System.out.println(k + " : " + v));
    }
}
