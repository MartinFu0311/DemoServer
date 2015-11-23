package webDemo;

import java.util.*;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class IteratorTag extends SimpleTagSupport {
	private String collection;
	private String item;
	
	public String getCollection(){
		return this.collection;
	}
	
	public void setCollection(String collection){
		this.collection = collection;
	}
	
	public String getItem(){
		return this.item;
	}
	
	public void setItem(String item){
		this.item = item;
	}
	
	public void doTag() throws JspException, IOException{
		Collection<?> itemList = (Collection<?>)getJspContext().getAttribute(collection);
		
		for(Object s: itemList){
			getJspContext().setAttribute(item, s);
			getJspBody().invoke(null);	
		}
	}
}
