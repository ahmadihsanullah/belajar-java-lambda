package programmer.zaman.now.lambda.util;

public class StringUtil {
   public static boolean isLowerCase(String value) {
       for(char i : value.toCharArray())
           if (!Character.isLowerCase(i)) {
               return false;
           }
       ;
       return true;
   };

}
