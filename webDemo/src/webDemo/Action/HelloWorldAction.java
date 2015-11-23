package webDemo.Action;

import com.opensymphony.xwork2.*;

public class HelloWorldAction implements Action {
	private String account;
	private String password;
	private String submitFlag;
	
	public String execute() throws Exception{
		System.out.println("The parameters user inputed is === account=" + account + ", password=" + password + ", submitFlag=" + submitFlag);
		
		return "toWelcome";
	}
	
	public void setAccount(String account){
		this.account = account;
	}
	
	public String getAccount(){
		return this.account;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setSubmitFlag(String submitFlag){
		this.submitFlag = submitFlag;
	}
	
	public String getSubmitFlag(){
		return this.submitFlag;
	}
}
