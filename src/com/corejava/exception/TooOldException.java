package com.corejava.exception;

public class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}