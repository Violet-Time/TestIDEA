package lesson_3;

import java.awt.*;

public class MyLine{
    public MyPoint pointStart;
    public MyPoint pointEnd;

    public MyLine(int x_S, int y_S, int x_E, int y_E){
        pointStart = new MyPoint(x_S,y_S);
        pointEnd = new MyPoint(x_E,y_E);
    }

    public String print(){
        return "Начальная точка" + pointStart.print() + "; Конечная точка" + pointEnd.print() + ";";
    }

    class MyPoint{
        private int x,y;
        MyPoint(int x,int y){
            this.x = x;
            this.y = y;
        }
        public String print(){
            return "(" + x + "," + y + ")";
        }
    }
}