package customexception;

//UnChecked Exception
class InvalidPasswordException extends RuntimeException {
	
	private String message; // private String message = "Invalid Password Entered!";
	
	InvalidPasswordException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message; // return "Invalid Password Entered!";
	}
}
