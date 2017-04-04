package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public interface LoginRepository {

    void saveUser(User user);

    User getUser();
}
