package com.celfocus.qa.training.exceptions;

public class NoMessageException extends Exception {
  public NoMessageException() {
    super("No message received, please send a message.");
  }
}
