package chapterThree;

import java.io.File;
import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;
import chapterThree.util.*;

public class ImageUpload extends ActionSupport{
	
	public String execute(){
		
		try{
			getPortfolioService().addImage(pic, getPicFileName(), "E:\\");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	File pic;
	String picContentType;
	String picFileName;
	
	public File getPic(){
		
		return this.pic;
		
	}
	
	public void setPic(File pic){
		
		this.pic = pic;
		
	}
	
	public String getPicContentType(){
		
		return this.picContentType;
		
	}
	
	public void setPicContentType(String picContentType){
		
		this.picContentType = picContentType;
		
	}
	
	public String getPicFileName(){
		
		return this.picFileName;
		
	}
	
	public void setPicFileName(String picFileName){
		
		this.picFileName = picFileName;
		
	}
	
	public PortfolioService getPortfolioService() {
		
		return new PortfolioService();
		
	}
	
}
