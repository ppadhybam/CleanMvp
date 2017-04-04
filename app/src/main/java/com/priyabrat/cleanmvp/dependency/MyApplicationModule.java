package com.priyabrat.cleanmvp.dependency;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PriyabratP on 03-04-2017.
 */

@Module
public class MyApplicationModule {

    private MyApplication myApplication;

    public MyApplicationModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    public MyApplication provideMyApplication(){
        return this.myApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return this.myApplication;
    }

}
