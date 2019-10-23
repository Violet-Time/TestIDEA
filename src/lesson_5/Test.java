package lesson_5;

import javax.swing.*;

public class Test{
    public double r(double d){
        while (true) {
            try {
                double r = Double.valueOf(JOptionPane.showInputDialog("Введите строку"));
                return r;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void writeNums(int i){
        if(i>0) {
            writeNums(i-1);
            System.out.println(i);

        }

    }
}
