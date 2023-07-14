package javaproject.com;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray 
{
  public static void main(String[] args) 
  {
	List<String> li=new ArrayList<>();
	li.add("altaf");
	li.add("malik");
	li.add("goraya");
	li.add("itwa");
	
	String [] str_array=new String[li.size()];
	
	for(int i=0; i<str_array.length; i++) 
	{
		str_array[i] =li.get(i);
	}
	for(String str:str_array)
	{
		System.out.println(str);
	}
  }
}
