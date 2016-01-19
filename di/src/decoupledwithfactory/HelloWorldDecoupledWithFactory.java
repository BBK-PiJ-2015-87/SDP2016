package decoupledwithfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        MessageRenderer mr = MessageSupportFactory.getInstance()
                .getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance()
                .getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

//        Class clazz = Class.forName("decoupledwithfactory.CustomPhraseMessageProvider");
//        Method m = clazz.getDeclaredMethod("getMessage");
//        System.out.println(m.invoke(clazz.newInstance()));
//
//        CustomPhraseMessageProvider cmp = new CustomPhraseMessageProvider(){
//            public String getMessage() {
//                return "HELOOOOOOO";
//            }
//        };
//
//        Class clazz2 = cmp.getClass();
//        Method m2 = clazz2.getDeclaredMethod("getMessage");
//        System.out.println(m.invoke(new CustomPhraseMessageProvider()));
    }
}