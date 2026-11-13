package com;

class LoginException {
private String message;
	
    LoginException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
