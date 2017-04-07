package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class LoginContract {

    public interface View {
        String getUserName();
        String getUserPass();
        void setUserName(String userName);
        void setUserPass(String userPass);
        void onErrorMessage(String errorMessage);
        void showUserSaved();
    }

    public interface Presenter {
        void setView(LoginContract.View loginView);
        void onLoginClicked();
        void getCurrentUser();
    }

    public interface Model {
        void createUser(User user);
        User getUser();
    }
}
