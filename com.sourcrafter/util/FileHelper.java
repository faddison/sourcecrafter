package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHelper
{
	public static String readFile(String filename)
	{
		String fileAsText = new String();
		
		try 
		{
			fileAsText = new Scanner(new File(filename)).useDelimiter("\\A").next();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return fileAsText;
	}
}
