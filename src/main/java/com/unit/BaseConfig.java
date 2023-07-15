package com.unit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {

	// getConfig return "value"

	public static String getConfig(String testData) throws IOException{
		String filePath="./Enviroments/qa.properties";
		// file> fin class> stream
		FileInputStream fis = new FileInputStream(filePath);
		//read the value from  the file
		Properties pro = new Properties();
		pro.load(fis);
		// read each value
		String applicationURL =pro.get(testData).toString();
		
		
	return applicationURL;
	}
	public static void main(String[] args) throws IOException {
		
		System.out.println(getConfig("URL"));
		System.out.println(getConfig("EMAIL"));
		System.out.println(getConfig("PASSWORD"));
	}
		
	}

