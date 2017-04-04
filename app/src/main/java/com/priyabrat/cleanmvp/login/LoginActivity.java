package com.priyabrat.cleanmvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.priyabrat.cleanmvp.R;
import com.priyabrat.cleanmvp.dependency.MyApplication;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @Inject
    LoginContract.Presenter presenter;

    @BindView(R.id.editTextUserName)
    EditText editTextUserName;

    @BindView(R.id.editTextUserPass)
    EditText editTextUserPass;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        MyApplication.getComponent(this).inject(LoginActivity.this);
    }

    @OnClick(R.id.btnLogin)
    public void onLoginClick(){
        presenter.onLoginClicked();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getUserName() {
        return editTextUserName.getText().toString().trim();
    }

    @Override
    public String getUserPass() {
        return editTextUserPass.getText().toString().trim();
    }

    @Override
    public void setUserName(String userName) {
        editTextUserName.setText(userName);
    }

    @Override
    public void setUserPass(String userPass) {
        editTextUserPass.setText(userPass);
    }

    @Override
    public void onErrorMessage(String errorMessage) {
        Toast.makeText(this, ""+errorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this, "User Saved Successfully", Toast.LENGTH_SHORT).show();
    }
}
