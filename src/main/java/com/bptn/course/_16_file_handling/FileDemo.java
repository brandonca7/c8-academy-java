package com.bptn.course._16_file_handling;

import java.io.IOException;
import java.nio.file.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.UUID;
import java.util.Scanner;

public class FileDemo {

	private static String HOME = System.getProperty("user.home");

	
	public static void main(String[] args) {
// Create a file		
		String fileName = "myfile_1234" + ".txt";
		Path p = Paths.get(HOME + "/" + fileName);
		if(!Files.exists(p)){
		    try {
				Files.createFile(p);
			} catch (IOException e) {
				e.printStackTrace();
			}    
		}
//		System.out.println(Files.exists(p));
		
		
//		Writing to a file
		    if(Files.exists(p)){
		        FileWriter writer;
				try {
					writer = new FileWriter(new File(p.toUri()));
					writer.write("I have learnt how to write into a file!");
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
		        
		       
		    }
		
//		Read a file
	    if(Files.exists(p)){
	        Scanner scanner;
			try {
				scanner = new Scanner(new File(p.toUri()));
				System.out.println("File "+p.getFileName()+ " found...");
				while (scanner.hasNextLine()) {
		            String data = scanner.nextLine();
		            System.out.println("Data available in file :" + data);
		        }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        
	    }
//		Delete file
		try {
			Files.delete(p);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	


}
