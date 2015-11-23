package webDemo.Action;

import com.opensymphony.xwork2.*;
import webDemo.*;

public class HelloWorld3Action implements ModelDriven<HelloWorldModel>{
	private HelloWorldModel hwm = new HelloWorldModel();
	
	public HelloWorldModel getModel(){
		return this.hwm;
	}
	
	public String execute(){
		System.out.println(this.hwm);
		
		return "toWelcome";
	}
}
