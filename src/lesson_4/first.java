package lesson_4;

public class first {
    public static void main(String[] argc){
        int[] num = {1,2,3,4,5};
        try{
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("Завершение программы");
        }
    }
}
