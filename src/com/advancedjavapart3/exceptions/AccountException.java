package com.advancedjavapart3.exceptions;

public class AccountException extends Exception {
  public AccountException(Exception cause) {
    super(cause);
  }
}
