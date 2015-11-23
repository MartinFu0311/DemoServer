package webDemo.Action;

import com.opensymphony.xwork2.*;
import webDemo.*;

public class HelloWorld4Action implements ModelDriven<HelloWorldModel> {
	
	private HelloWorldModel hwm = new HelloWorldModel();
	
	public HelloWorldModel getHwm(){
		return this.hwm;
	}
	
	public void setHwm(HelloWorldModel hwm){
		this.hwm = hwm;
	}
	
	private HelloWorldModel hwm2 = new HelloWorldModel();	
	
	public HelloWorldModel getModel(){
		return this.hwm2;
	}
	
	public String account = "";
	
	public String execute(){
		System.out.println("Property driven : " + "Account : " + hwm.getAccount() + "; Password : " + hwm.getPassword() + "; SubmitFlag : " + hwm.getSubmitFlag());
		System.out.println("Model driven : " + "Account : " + hwm2.getAccount() + "; Password : " + hwm2.getPassword() + "; SubmitFlag : " + hwm2.getSubmitFlag());
		System.out.println("Current page : " + "Account : " + this.account);
		
		return "toWelcome";
	}
}
