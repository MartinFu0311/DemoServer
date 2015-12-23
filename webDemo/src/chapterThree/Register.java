package chapterThree;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	public String execute(){
		return Register.SUCCESS;
	}
	
	public void validate(){
		if(getUserName().length() == 0){
			addFieldError("username", "User name is required");
		}
	}
	
	private String userName;
	private String password;
	private String portfolioName;
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPortfolioName(){
		return this.portfolioName;
	}
	
	public void setPortfolioName(String portfolioName){
		this.portfolioName = portfolioName;
	}
	
}
