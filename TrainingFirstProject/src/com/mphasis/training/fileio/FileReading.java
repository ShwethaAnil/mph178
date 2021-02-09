package com.mphasis.training.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream("sagarletter.txt");
		//int i=fis.read();
		int i=0;
		while(( i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
