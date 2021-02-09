package com.mphasis.training.fileio;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo1 {

	public static void main(String[] args)throws IOException {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		FileOutputStream fos1=new FileOutputStream("xyz.txt");
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		String s="Welcome to java io";
		bos.write(s.getBytes());
		bos.writeTo(fos);
		bos.writeTo(fos1);
		bos.flush();
		fos1.flush();
		fos.flush();
		bos.close();
		fos1.close();
		fos.close();

	}

}
