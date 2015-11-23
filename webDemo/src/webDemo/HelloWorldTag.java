package webDemo;

import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloWorldTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException{
		getJspContext().getOut().write("Hello World " + new Date());
	}
}
