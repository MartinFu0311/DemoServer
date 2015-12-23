package chapterFive;

import com.opensymphony.xwork2.*;

public class ArrayDataTransfer extends ActionSupport {

	public String execute(){
		return SUCCESS;
	}
	
	private Double[] ages;
	
	public Double[] getAges(){
		return this.ages;
	}
	
	public void setAges(Double[] ages){
		this.ages = ages;
	}
	
	private String[] names = new String[10];
	
	public String[] getNames(){
		return this.names;
	}
	
	public void setNames(String[] names){
		this.names = names;
	}
	
}
