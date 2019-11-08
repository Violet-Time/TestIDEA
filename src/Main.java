import Test.Sqrt;
import lesson_3.MyLine;
import lesson_3.User;
import lesson_3.UserSocial;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
//import  java.util.Arrays.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
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
//        UserSocial user = new UserSocial(0,"sdfsdf","sfsdfsdf","gsdfgdsfg",20);
//        user.printUser();

//        Sqrt t = new Sqrt(9,2);

//        System.out.println("Java".toUpperCase());
//        UserSocial.test();

        /* a strange /* // /* single-line comment */
//        char[] array = new char[1];
//        String das;

        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int y = 0;
        String str = "";
        for (int i = 0;i < n;){
            if (a > 0 && i < n){
                str = str + Character.toString(65 + y);
                a--;
                i++;
            }
            if (b > 0 && i < n){
                str = str + Character.toString(97 + y);
                b--;
                i++;
            }
            if (c > 0 && i < n){
                str = str + y;
                c--;
                i++;
            }
            if (c <= 0 && b <= 0 && a <= 0 && i < n){
                str = str + Character.toString(97 + y + 10);
                i++;
            }

            if (++y > 10) y = 0;
        }
        System.out.println(str);
        */
        byte[] a = {97,98,99,100,101,102};

        CharSequence ascii = new AsciiCharSequence(a);
        System.out.println(ascii.toString());
        System.out.println(ascii.charAt(5));
        System.out.println(ascii.length());
        System.out.println(ascii.subSequence(1,5).toString());

        String str = "fsdfdf fgdfgd";
//        System.out.println(str.substring(0,5));
        System.out.println(str.replace(" ","\n"));





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



