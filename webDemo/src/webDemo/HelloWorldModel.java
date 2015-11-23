package webDemo;

public class HelloWorldModel {
	private String account;
	private String password;
	private String submitFlag;
	
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
	
	public void businessExecute(){
		System.out.println("business processing...");
	}
}
