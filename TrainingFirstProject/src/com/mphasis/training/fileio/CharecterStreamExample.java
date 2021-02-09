package com.mphasis.training.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharecterStreamExample {

	public static void main(String[] args)throws IOException {
		Writer out=new FileWriter("char.txt");
		out.write("Welcome to Java IO");
		out.close();

	}

}
