package lesson_3;

class MyMath {
    private static int anum = 0;
    static double add(int a, int b){
        anum++;
        return a+b;
    }
    static double sub(int a, int b){
        anum++;
        return a-b;
    }
    static double mult(int a, int b){
        anum++;
        return a*b;
    }
    static double div(int a, int b){
        anum++;
        return a/b;
    }
    public static int getAnum(){
        return anum;
    }

}