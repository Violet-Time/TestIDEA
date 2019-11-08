package lesson_3;

import lesson_3.User;

import java.awt.*;
import java.lang.reflect.Array;


public class UserSocial extends User{
    private String user_name;
    private int year_old;
    public UserSocial(int id, String login, String password,String user_name,int year_old){
        super(id,login,password);
        this.user_name=user_name;
        this.year_old=year_old;
    }
    public String[] getData() {
        String[] data = {String.valueOf(this.year_old), this.user_name};
        String[] c = (String[]) Array.newInstance(data.getClass().getComponentType(), data.length + super.getData().length);
        System.arraycopy(data, 0, c, 0, data.length);
        System.arraycopy(super.getData(), 0, c, data.length, super.getData().length);
        return c;
    }

    @Override
    public void printUser() {
        System.out.println(user_name);
    }

    public static void test(){
        int a = 6;
    }

}
class WebMaster extends User {
    private String user_url;
    WebMaster(int id, String login, String password,String user_url){
        super(id,login,password);
        this.user_url=user_url;
    }

    @Override
    public void printUser() {
        System.out.println(user_url);
    }
}
