import javax.swing.*;

public class Lessons {
    public void lesson_1(String str) {
        //"Привет мир!";
        System.out.println(str);
        //JOptionPane.showMessageDialog(null,str);
    }

    public void lesson_2() {
        String str = "53.5";
        double d = Double.parseDouble(str);
        System.out.println(d);
        int age = 22;
        System.out.println(age);

    }

    public void lesson_3() {
        double a = 10, b = 20;
        double sum = a + b;
        sum = sum - a;
        sum = sum * b;
        sum = sum / a;
        System.out.println(sum);
        a += 5;
        System.out.println(a);
        int c = 10;
        System.out.println(c % 3);
    }

    public void lesson_5() {
        Boolean a = true, b = false, c = false;
        System.out.println(a ^ b);
    }

    public void lesson_6() {
        int a = 3, b = 5;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println(s_a + ' ' + s_b);
        System.out.println(Integer.toBinaryString(a ^ b));
    }
    public void lesson_7(){
        String a = JOptionPane.showInputDialog(null,"xbh", JOptionPane.QUESTION_MESSAGE);
        System.out.println(a);
    }

}
