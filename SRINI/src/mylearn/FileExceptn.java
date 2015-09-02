package mylearn;

import java.io.*;

public class FileExceptn {

	public static void main(String args[]){		
	      File file=new File("D:/test.txt");   
	      Boolean path = file.isFile(); 
	      System.out.println(path); 
	      try {
			System.out.println("File Found");  
			FileInputStream in = new FileInputStream("D:/test.txt");
			FileOutputStream ou = new FileOutputStream("D:/test1.txt");
			int c;
	         while ((c = in.read()) != -1) {
	        	 System.out.println(c); 
	            ou.write(c); 
	         }	
	         in.close();   
		    	ou.close(); 
	      }
	      catch(Exception e)
	      {
	    	  System.out.println("File Not Found");  
	      }
	     	       
	}      

}