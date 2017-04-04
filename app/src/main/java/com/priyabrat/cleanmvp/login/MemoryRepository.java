package com.priyabrat.cleanmvp.login;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class MemoryRepository implements LoginRepository {


    private User user;

    @Override
    public void saveUser(User user) {
        if(user == null){
            user = getUser();
        }
        this.user = user;
    }

    @Override
    public User getUser() {
        if(user == null)
            user = new User("root","admin");
        return user;
    }
}
