package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        testScore(60, ()-> getName());
    }

    public static void testScore(int nilai, Supplier<String> name){
        if(nilai > 80){
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("method getName() dipanggil");
        return "Ahmad";
    }
}
