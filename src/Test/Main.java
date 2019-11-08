package Test;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();
        int days = Integer.parseInt(strIn.substring(8, 10));
        int month = Integer.parseInt(strIn.substring(5, 7));
        int year = Integer.parseInt(strIn.substring(0, 4));
        if(days > 0 && days <= 31 && month > 0 && month <=12 && year > 0){
            System.out.println(strIn.substring(5, 7) + "/" + strIn.substring(8, 10) + "/" + strIn.substring(0, 4));
        }else {
            System.out.println("Incorrect input");
        }


       /* DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevel() > medium.getLevel());
        System.out.println(high.getStr());
        for(DangerLevel s : DangerLevel.values()){
            if(s.toString().lastIndexOf("HIGH") == 0){

            }
            System.out.println(s.toString().lastIndexOf("HIGH"));
        }*/
    }
}

enum DangerLevel {
    HIGH(3,"aaaa"),
    HIGHS(3,"aaaa"),
    HIGHF(3,"aaaa"),
    HIGHSHIGH(3,"aaaa"),
    MEDIUM(2, "bbbb"),
    LOW(1, "ccccc");

    private int level;
    private String str;

    DangerLevel (int level, String str){
        this.level = level;
        this.str = str;
    }

    public int getLevel(){
        return this.level;
    }
    public String getStr(){
        return this.str;
    }
}