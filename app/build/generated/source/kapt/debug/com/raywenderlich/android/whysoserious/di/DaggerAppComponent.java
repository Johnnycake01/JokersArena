// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.raywenderlich.android.whysoserious.di;

import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationManager;
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseManager;
import com.raywenderlich.android.whysoserious.presentation.AddJokePresenter;
import com.raywenderlich.android.whysoserious.presentation.AllJokesPresenter;
import com.raywenderlich.android.whysoserious.presentation.FavoriteJokesPresenter;
import com.raywenderlich.android.whysoserious.presentation.LoginPresenter;
import com.raywenderlich.android.whysoserious.presentation.ProfilePresenter;
import com.raywenderlich.android.whysoserious.presentation.RegisterPresenter;
import com.raywenderlich.android.whysoserious.presentation.WelcomePresenter;
import com.raywenderlich.android.whysoserious.presentation.implementation.AddJokePresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.AllJokesPresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.FavoriteJokesPresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.LoginPresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.ProfilePresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.RegisterPresenterImpl;
import com.raywenderlich.android.whysoserious.presentation.implementation.WelcomePresenterImpl;

public final class DaggerAppComponent implements AppComponent {
  private DaggerAppComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @Override
  public RegisterPresenter registerPresenter() {
    return new RegisterPresenterImpl(
        new FirebaseDatabaseManager(), new FirebaseAuthenticationManager());
  }

  @Override
  public LoginPresenter loginPresenter() {
    return new LoginPresenterImpl(new FirebaseAuthenticationManager());
  }

  @Override
  public AllJokesPresenter allJokesPresenter() {
    return new AllJokesPresenterImpl(
        new FirebaseAuthenticationManager(), new FirebaseDatabaseManager());
  }

  @Override
  public FavoriteJokesPresenter favoriteJokesPresenter() {
    return new FavoriteJokesPresenterImpl(
        new FirebaseAuthenticationManager(), new FirebaseDatabaseManager());
  }

  @Override
  public ProfilePresenter profilePresenter() {
    return new ProfilePresenterImpl(
        new FirebaseAuthenticationManager(), new FirebaseDatabaseManager());
  }

  @Override
  public AddJokePresenter addJokePresenter() {
    return new AddJokePresenterImpl(
        new FirebaseAuthenticationManager(), new FirebaseDatabaseManager());
  }

  @Override
  public WelcomePresenter welcomePresenter() {
    return new WelcomePresenterImpl(new FirebaseAuthenticationManager());
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }
  }
}
