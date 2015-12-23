package chapterThree.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PortfolioService {

	public void addImage ( File pic, String fileName, String fileSystemHome ) throws IOException 
	{
		/* add image to the portfolio and save image file to local filesystem */
		FileInputStream in = null;
	    FileOutputStream out = null;
	        
	        String directoryName = fileSystemHome;
	        File dir = new File ( directoryName);
	        if ( !dir.exists() )
	           dir.mkdir();
	        String targetPath =  dir.getPath() + dir.separator + fileName;
	        System.out.println("writing file to " + targetPath);
	        
	        File picDestination = new File ( targetPath);
	        try {
	            in = new FileInputStream( pic );
	            out = new FileOutputStream( picDestination );
	            int c;

	            while ((c = in.read()) != -1) {
	                out.write(c);
	            }

	        }finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	        }
		
	}
	
}
