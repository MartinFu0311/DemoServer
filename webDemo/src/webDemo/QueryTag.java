package webDemo;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class QueryTag extends SimpleTagSupport {
	private String displayInfo;
	
	public void setDisplayInfo(String displayInfo){
		this.displayInfo = displayInfo;
	}
	
	public String getDisplayInfo(){
		return this.displayInfo;
	}
	
	public void doTag() throws JspException, IOException{
		getJspContext().getOut().write(this.displayInfo);
	}
}
