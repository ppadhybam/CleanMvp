package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class LoginContract {

    interface View {
        String getUserName();
        String getUserPass();
        void setUserName(String userName);
        void setUserPass(String userPass);
        void onErrorMessage(String errorMessage);
        void showUserSaved();
    }

    interface Presenter {
        void setView(LoginContract.View loginView);
        void onLoginClicked();
        void getCurrentUser();
    }

    interface Model {
        void createUser(User user);
        User getUser();
    }
}
