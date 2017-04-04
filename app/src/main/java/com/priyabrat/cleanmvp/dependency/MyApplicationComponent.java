package com.priyabrat.cleanmvp.dependency;

import com.priyabrat.cleanmvp.login.LoginActivity;
import com.priyabrat.cleanmvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by PriyabratP on 03-04-2017.
 */

@Singleton
@Component(
        modules = {
                MyApplicationModule.class,
                LoginModule.class
        }
)
public interface MyApplicationComponent {

    void inject(LoginActivity loginActivity);
}
