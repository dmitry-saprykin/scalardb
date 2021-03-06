package com.scalar.database.exception.storage;

public class ReadRepairableExecutionException extends ExecutionException {

  public ReadRepairableExecutionException(String message) {
    super(message);
  }

  public ReadRepairableExecutionException(String message, Throwable cause) {
    super(message, cause);
  }
}
