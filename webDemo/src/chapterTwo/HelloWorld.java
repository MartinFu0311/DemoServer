package chapterTwo;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	
	private static final String GREETING = "Hello ";
	
	public String execute(){
		
		String msg = getText("user.exists");
		//setCustomGreeting(GREETING + getName());
		setCustomGreeting(msg);
		return "SUCCESS";
	}
	
	private String name;
	private String customGreeting;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getCustomGreeting(){
		return this.customGreeting;
	}
	
	public void setCustomGreeting(String customGreeting){
		this.customGreeting = customGreeting;
	}
}
