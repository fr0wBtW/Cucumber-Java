package uni.pu.fmi.models;



public class LoginScreenModel {

	private String username;
	private String password;
	private String message;
	
	public void navigateToMe() {
	System.out.println("Екрана на вход в системата е отворен");
		
	}

	public void setUsername(String username) {
		this.username=username;
		
	}

	public void setPassword(String password) {
		this.password=password;
		
	}

	public void clickLoginButton() {
	//	 return;
		
	}

	public String getLogingMessage() {
		return message;
	}

}
