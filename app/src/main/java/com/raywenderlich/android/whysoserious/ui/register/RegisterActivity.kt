/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.whysoserious.ui.register

import android.content.Context
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v7.app.AppCompatActivity
import com.raywenderlich.android.whysoserious.R
import com.raywenderlich.android.whysoserious.common.EMAIL_REGEX
import com.raywenderlich.android.whysoserious.common.onClick
import com.raywenderlich.android.whysoserious.common.onTextChanged
import com.raywenderlich.android.whysoserious.registerPresenter
import com.raywenderlich.android.whysoserious.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_register.*
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity(), RegisterView {

  private val presenter by lazy { registerPresenter() }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)
    presenter.setView(this)
    initUi()
  }

  private fun initUi() {
    usernameInput.onTextChanged { presenter.onUsernameChanged(it) }
    emailInput.onTextChanged { presenter.onEmailChanged(it) }
    passwordInput.onTextChanged { presenter.onPasswordChanged(it) }
    repeatPasswordInput.onTextChanged { presenter.onRepeatPasswordChanged(it) }

    registerButton.onClick { presenter.onRegisterTapped() }
  }

  enum class EmailErrorType(@StringRes val errorResource: Int) {
    NONE(0),
    EMPTY(R.string.email_empty_error),
    INVALID(R.string.email_error)
  }

  fun getError(context: Context, resource: Int) = if (resource==0) null else context.getString(resource)

  private fun onEmailChanged(email: String): EmailErrorType = when {
    email.isEmpty() -> EmailErrorType.EMPTY
    !Pattern.matches(EMAIL_REGEX, email) -> EmailErrorType.INVALID
    else -> EmailErrorType.NONE
  }

  override fun onRegisterSuccess() = startActivity(MainActivity.getLaunchIntent(this))

  override fun showSignUpError() {
  }

  override fun showUsernameError() {
    usernameInput.error = getString(R.string.username_error)
  }

  override fun showEmailError() {
    emailInput.error = getString(R.string.email_error)
  }

  override fun showPasswordError() {
    passwordInput.error = getString(R.string.password_error)
  }

  override fun showPasswordMatchingError() {
    repeatPasswordInput.error = getString(R.string.repeat_password_error)
  }
}