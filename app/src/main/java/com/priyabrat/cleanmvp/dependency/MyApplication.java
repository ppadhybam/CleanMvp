package com.priyabrat.cleanmvp.dependency;

import android.app.Application;
import android.content.Context;

import com.priyabrat.cleanmvp.login.LoginModule;

/**
 * Created by PriyabratP on 03-04-2017.
 */

public class MyApplication extends Application {

    private MyApplicationComponent myApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationComponent = DaggerMyApplicationComponent.builder()
                .myApplicationModule(new MyApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public static MyApplicationComponent getComponent(Context context){
        return ((MyApplication)context.getApplicationContext()).myApplicationComponent;
    }
}
