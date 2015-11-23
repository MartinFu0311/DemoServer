package chapterTwo;

public class HelloWorld {
	
	private static final String GREETING = "Hello ";
	
	public String execute(){
		
		setCustomGreeting(GREETING + getName());
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
