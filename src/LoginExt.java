public class LoginExt extends Exception {
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private int code;
    LoginExt(int code){
        this.code = code;
    }
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
}
