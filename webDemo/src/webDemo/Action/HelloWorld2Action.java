package webDemo.Action;

import com.opensymphony.xwork2.*;
import webDemo.*;

public class HelloWorld2Action implements Action{
	private HelloWorldModel hwm = new HelloWorldModel();
	
	public HelloWorldModel getHwm(){
		return this.hwm;
	}
	
	public void setHwm(HelloWorldModel hwm){
		this.hwm = hwm;
	}
	
	public String execute(){
		System.out.println(hwm);
		
		return "toWelcome";
	}
}
