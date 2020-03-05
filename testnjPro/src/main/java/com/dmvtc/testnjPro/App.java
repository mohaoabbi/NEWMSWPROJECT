package com.dmvtc.testnjPro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import bsh.commands.dir;

public class App extends setup
{
    public static void main( String[] args ) throws IOException
    {
    	//lounchBrowser("chrome");
    	System.out.println(System.getProperty("user.dir"));
    	File file = new File("System.getProperty(\"user.dir\")+\\Resources\\config.properties");
    	Properties ppt = new Properties();
    	FileInputStream fileinp = new FileInputStream(file);
    	ppt.load(fileinp);
    	
    	String user =ppt.getProperty("username");
    	
    	System.out.println(user);
    	
    }
}
