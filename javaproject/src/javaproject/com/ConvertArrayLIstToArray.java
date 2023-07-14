package javaproject.com;

import java.util.ArrayList;

public class ConvertArrayLIstToArray 
{
  public static void main(String[] args)
  {
	  ArrayList<String>lis=new ArrayList<>();
	                   lis.add("altaf");
	                   lis.add("malik");
	                   lis.add("Goraya");
	                   
	          for(String str:lis) 
	          {
	        	  System.out.println(lis);
	          }
	          
	     //how to create array in java
	    //data_type[] array_name=new data_type[]; 
	    String [] str_array=new String[lis.size()] ; 
	    for(int i=0; i<str_array.length; i++) 
	    {
	    	         str_array[i]   =lis.get(i);
	    }
	    for(String str:str_array)
	    {
	    	System.out.println(str);
	    }
  }
}
