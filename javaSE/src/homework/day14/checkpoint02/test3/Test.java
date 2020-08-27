package homework.day14.checkpoint02.test3;

public class Test {
    public static void main(String[] args) {
        try {
//            login("adm","admin");
//            login("admin","adm");
            login("admin","admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd) throws LoginException {
        if(name!="admin"){
            throw new LoginException("用户名不存在");
        }else if(pwd!="admin"){
            throw new LoginException("密码错误");
        }else {
            System.out.println("欢迎"+name);
        }
    }
}
