package controller;

public class LoginController {
    public boolean checkUserNameAndPassword(String userName, String password) {

        if(userName.equals("pathum") && password.equals("1234")){

            return true;
        }
        return false;
    }
}
