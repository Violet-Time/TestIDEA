public class Login {
    private String login;
    public void setLogin(String login) throws LoginExt{
        if (login.length()<3){
            throw  new LoginExt(LoginExt.SHORT_LOGIN);
        }else if (login.length()>8){
            throw new LoginExt(LoginExt.LONG_LOGIN);
        }else this.login = login;
    }
    public String getLogin(){
        return this.login;
    }
    public  String getLogin(String a){
        return this.login;
    }
    public  String getLogin(int a){
        return this.login;
    }
    public  String getLogin(String a, int b){
        return this.login;
    }
}
