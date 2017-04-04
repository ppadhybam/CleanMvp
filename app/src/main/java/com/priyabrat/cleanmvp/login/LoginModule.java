package com.priyabrat.cleanmvp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PriyabratP on 03-04-2017.
 */

@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter provideLoginPresenter(LoginContract.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    public LoginContract.Model provideLoginModel(LoginRepository loginRepository){
        return new LoginModel(loginRepository);
    }


    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }
}
