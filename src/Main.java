import lesson_3.MyLine;
import lesson_3.UserSocial;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] argc) {
//        lesson_6.User a = new lesson_6.User(0, "dsfgdsfg", "dsfg");
//        lesson_6.User b = new lesson_6.User(1, "zsdgf", "asdfasder");
//
//        for (String x : a.getData()) {
//            System.out.println(x);
//        }
//        for (String x : b.getData()) {
//            System.out.println(x);
//        }


//        lesson_3.UserSocial a = new lesson_3.UserSocial(0,"sdfsdf","sfsdfsdf","gsdfgdsfg",20);
//        for (String x : a.getData()) {
//            System.out.println(x);
//        }

//        Integer[] arr = {500,600,4,324,5436756,68,24,76,87};
//        Arrays.sort(arr,
//                (s1, s2)->{
//            return Integer.compare(s1,s2);
//        });
//        for (int s : arr)System.out.println(s);
//        while (login()){
//        }

//        for(int i = 0;i<5;i++ ){
//            System.out.println(i);
//        }

//        MyLine lind = new MyLine(5,7,10,3);
//        System.out.println(lind.print());
        UserSocial user = new UserSocial(0,"sdfsdf","sfsdfsdf","gsdfgdsfg",20);
        user.printUser();
    }
    public static boolean login(){
        String in = JOptionPane.showInputDialog(null,"in");
        Login user = new Login();
        try {
            user.setLogin(in);
            JOptionPane.showMessageDialog(null,user.getLogin());
            return false;
        }catch (LoginExt ex){
            switch (ex.getCode()){
                case LoginExt.SHORT_LOGIN:
                    JOptionPane.showMessageDialog(null,"Коротко");
                    break;
                case LoginExt.LONG_LOGIN:
                    JOptionPane.showMessageDialog(null,"Длинно");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Чет пиздц");
                    break;
            }
            return true;
        }
    }
}
