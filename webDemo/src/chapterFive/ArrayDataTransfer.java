package chapterFive;

import java.util.*;
import com.opensymphony.xwork2.*;
import chapterFive.util.*;

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
	
	private List lastNames;
	
	public List getLastNames(){
		return this.lastNames;
	}
	
	public void setLastNames(List lastNames){
		this.lastNames = lastNames;
	}
	
	private List middleNames;
	
	public List getMiddleNames(){
		return this.middleNames;
	}
	
	public void setMiddleNames(List middleNames){
		this.middleNames = middleNames;
	}
	
	public List<User> users;
	
	public List<User> getUsers(){
		return this.users;
	}
	
	public void setUsers(List<User> users){
		this.users = users;
	}
	
	private List weights;

	public List getWeights() {
		return weights;
	}

	public void setWeights(List weight) {
		this.weights = weight;
	}
	
}
