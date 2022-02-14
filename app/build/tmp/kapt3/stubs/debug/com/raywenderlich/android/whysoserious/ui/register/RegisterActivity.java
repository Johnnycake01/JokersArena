package com.raywenderlich.android.whysoserious.ui.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/register/RegisterActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/raywenderlich/android/whysoserious/ui/register/RegisterView;", "()V", "presenter", "Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "getPresenter", "()Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "getError", "", "context", "Landroid/content/Context;", "resource", "", "initUi", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEmailChanged", "Lcom/raywenderlich/android/whysoserious/ui/register/RegisterActivity$EmailErrorType;", "email", "onRegisterSuccess", "showEmailError", "showPasswordError", "showPasswordMatchingError", "showSignUpError", "showUsernameError", "EmailErrorType", "app_debug"})
public final class RegisterActivity extends android.support.v7.app.AppCompatActivity implements com.raywenderlich.android.whysoserious.ui.register.RegisterView {
    private final kotlin.Lazy presenter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public RegisterActivity() {
        super();
    }
    
    private final com.raywenderlich.android.whysoserious.presentation.RegisterPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resource) {
        return null;
    }
    
    private final com.raywenderlich.android.whysoserious.ui.register.RegisterActivity.EmailErrorType onEmailChanged(java.lang.String email) {
        return null;
    }
    
    @java.lang.Override()
    public void onRegisterSuccess() {
    }
    
    @java.lang.Override()
    public void showSignUpError() {
    }
    
    @java.lang.Override()
    public void showUsernameError() {
    }
    
    @java.lang.Override()
    public void showEmailError() {
    }
    
    @java.lang.Override()
    public void showPasswordError() {
    }
    
    @java.lang.Override()
    public void showPasswordMatchingError() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/register/RegisterActivity$EmailErrorType;", "", "errorResource", "", "(Ljava/lang/String;II)V", "getErrorResource", "()I", "NONE", "EMPTY", "INVALID", "app_debug"})
    public static enum EmailErrorType {
        /*public static final*/ NONE /* = new NONE(0) */,
        /*public static final*/ EMPTY /* = new EMPTY(0) */,
        /*public static final*/ INVALID /* = new INVALID(0) */;
        private final int errorResource = 0;
        
        EmailErrorType(@android.support.annotation.StringRes()
        int errorResource) {
        }
        
        public final int getErrorResource() {
            return 0;
        }
    }
}