package com.priyabrat.cleanmvp;

import com.priyabrat.cleanmvp.login.LoginContract;
import com.priyabrat.cleanmvp.login.LoginPresenter;
import com.priyabrat.cleanmvp.login.User;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

/**
 * Created by PriyabratP on 07-04-2017.
 */


public class LoginPresenterTestWithJUnitMockito {

    LoginContract.Model model;
    LoginContract.View view;
    LoginPresenter presenter;
    User user;

    @Before
    public void onBefore(){
        model = mock(LoginContract.Model.class);
        user = new User("priyabrat","padhy");

        when(model.getUser()).thenReturn(user);

        view = mock(LoginContract.View.class);
        presenter = new LoginPresenter(model);
        presenter.setView(view);
    }


    @Test
    public void shouldMakeUserLogin(){
        /*presenter.getCurrentUser();
        verifyZeroInteractions(view);*/
    }

    @Test
    public void shouldMakeUserLoginAndValidateDifferentScenarios(){
        presenter.getCurrentUser();
        when(model.getUser()).thenReturn(user);
        verify(model,times(1)).getUser();
        verify(view,times(1)).setUserName("priyabrat");
        verify(view,times(1)).setUserPass("padhy");
        verify(view,never()).onErrorMessage("No User");

        when(view.getUserName()).thenReturn("priyabrat");
        when(view.getUserPass()).thenReturn("");

    }
}
