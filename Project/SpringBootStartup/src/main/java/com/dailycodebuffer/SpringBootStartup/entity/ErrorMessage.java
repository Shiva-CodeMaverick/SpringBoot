package com.dailycodebuffer.SpringBootStartup.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	public ErrorMessage() {
	}
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}
	public ErrorMessage(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}
	private HttpStatus status;
	private String message;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
