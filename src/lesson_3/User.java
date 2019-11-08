package lesson_3;

public abstract class User implements PrintData {
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public void setData(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String[] getData() {
        String[] data = {String.valueOf(this.id), this.login, this.password};

        return data;
    }


    @Override
    public void printUser() {

    }

    public static void test(){
        int a = 5;
    }

}
