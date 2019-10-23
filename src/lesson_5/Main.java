package lesson_5;

import javax.swing.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] argc){
//        String str = JOptionPane.showInputDialog(null,"Введите строку");
//        System.out.println(str.toLowerCase());
//        System.out.println(str.substring(1,5));
//        System.out.println(str.indexOf("hello"));

//        double S = Math.PI * r();
//        JOptionPane.showMessageDialog(null,S);
//        double sum = 52455,pr = 5.7;
//        for (int i = 0;i<1;i++){
//            sum = (sum * pr/100) + sum;
//        }
//        JOptionPane.showMessageDialog(null, new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP));

//        HashMap<String,Integer> AgeUsers = new HashMap<String,Integer>();
//        AgeUsers.put("3",3);
//        AgeUsers.put("2",2);
//        AgeUsers.put("1",1);
//        AgeUsers.put("4",4);
//        for (Map.Entry<String,Integer> q:AgeUsers.entrySet())System.out.println(q.getKey() + '-' + q.getValue());
//        AgeUsers.replace("2",AgeUsers.get("2") + 4);
//        AgeUsers.forEach((u,v)->System.out.println(u+ "-"+v));


//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("11");
//        arr.add("22");
//        arr.add("33");
//        arr.add("44");
//        arr.add("55");
//        Iterator iter = arr.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        arr.add(1,"666");
//        System.out.println("------------");
//        arr.forEach((u)->System.out.println(u));

//        System.out.println(Math.random()*10);



//        int a = 5, b = 8;
//        System.out.println(a);
        Test t = new Test(){
            public double der(double a){
                return Math.pow(a,3);
            }
        };
        System.out.println(t.r(1.4));
    }



}

