package com.chirango.redditclone.exceptions;

public class SpringRedditException extends RuntimeException {

  public SpringRedditException(String message, Exception exception) {
    super(message, exception);
  }

  public SpringRedditException(String message) {
    super(message);
  }
}
