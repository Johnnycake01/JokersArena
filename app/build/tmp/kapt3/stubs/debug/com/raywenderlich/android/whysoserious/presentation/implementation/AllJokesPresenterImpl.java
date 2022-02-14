package com.raywenderlich.android.whysoserious.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/implementation/AllJokesPresenterImpl;", "Lcom/raywenderlich/android/whysoserious/presentation/AllJokesPresenter;", "authenticationInterface", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;", "databaseInterface", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "(Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;)V", "view", "Lcom/raywenderlich/android/whysoserious/ui/jokes/all/AllJokesView;", "getAllJokes", "", "onFavoriteButtonTapped", "joke", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "setView", "viewReady", "app_debug"})
public final class AllJokesPresenterImpl implements com.raywenderlich.android.whysoserious.presentation.AllJokesPresenter {
    private final com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface = null;
    private final com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface = null;
    private com.raywenderlich.android.whysoserious.ui.jokes.all.AllJokesView view;
    
    @javax.inject.Inject()
    public AllJokesPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface) {
        super();
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.jokes.all.AllJokesView view) {
    }
    
    @java.lang.Override()
    public void viewReady() {
    }
    
    @java.lang.Override()
    public void getAllJokes() {
    }
    
    @java.lang.Override()
    public void onFavoriteButtonTapped(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke) {
    }
}