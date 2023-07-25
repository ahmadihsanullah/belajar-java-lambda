package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //method isLowerCase => static, parameternya 1 dan sama. sehingga bisa gunakan method reference
        //Predicate<String> = isLowerCase(String)

//        Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("eko"));
        System.out.println(predicate.test("Eko"));

        //method reference di parameter, memanggil method yang diparameter.
        //method tidak boleh memiliki parameter
//        Function<String,String> function = value -> value.toUpperCase();
        Function<String,String> function = String::toUpperCase;
    }

    //mengakses method reference yang bukan static
    public void run(){
        Predicate<String> predicate2 = this::isLowerCase;

        System.out.println(predicate2.test("eko"));
        System.out.println(predicate2.test("Eko"));
    }
    //mengakses methode reference di object
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate2 = app::isLowerCase;

        System.out.println(predicate2.test("eko"));
        System.out.println(predicate2.test("Eko"));
    }

    public boolean isLowerCase(String value) {
        for(char i : value.toCharArray())
            if (!Character.isLowerCase(i)) {
                return false;
            }
        ;
        return true;
    };
}
