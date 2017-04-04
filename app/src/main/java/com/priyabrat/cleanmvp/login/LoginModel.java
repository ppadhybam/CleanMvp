package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class LoginModel implements LoginContract.Model {

    private LoginRepository loginRepository;

    public LoginModel(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }


    @Override
    public void createUser(User user) {
        loginRepository.saveUser(user);
    }

    @Override
    public User getUser() {
        return loginRepository.getUser();
    }
}
