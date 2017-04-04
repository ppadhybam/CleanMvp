package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private LoginContract.Model model;

    public LoginPresenter(LoginContract.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginContract.View loginView) {
        this.view = loginView;
    }

    @Override
    public void onLoginClicked() {
        if(view!=null){
            if(view.getUserName().equalsIgnoreCase("") || view.getUserPass().equalsIgnoreCase("")){
                view.onErrorMessage("Username & Password Can't be empty");
            }else {
                model.createUser(new User(0,view.getUserName(),view.getUserPass()));
                view.showUserSaved();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();
        if(view!=null){
            if(user!=null){
                view.setUserName(user.getUserName());
                view.setUserPass(user.getUserPass());
            }
        }
    }
}
