package com.codenicely.brandstore.project.login.view;

/**
 * Created by aman on 15/10/16.
 */
public interface LoginScreenView {


    void showLoading(boolean show);

    void showMessage(String message);

    void onLoginVerified();

    void onLoginFailed();
}

