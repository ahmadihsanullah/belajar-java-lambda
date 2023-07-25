package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        //anonymous class
//        SimpleAction simpleAction1 = new SimpleAction(){
//
//            @Override
//            public String action() {
//                return "Ahmad";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        //lambda
//        SimpleAction simpleAction2 = ()-> {
//            return "Ahmad";
//        };
//
//        System.out.println(simpleAction2.action());

        SimpleAction simpleAction1 = (String name)-> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String name) -> "Hello " + name;

        SimpleAction simpleAction4 = (name) -> "Hello " + name;

        SimpleAction simpleAction5 = name -> "Hello " + name;
    }
}
