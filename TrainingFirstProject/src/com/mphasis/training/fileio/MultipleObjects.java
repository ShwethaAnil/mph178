package com.mphasis.training.fileio;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.mphasis.training.pojos.Person;

public class MultipleObjects {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("persons.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p=null;
		boolean isExist=true;
		while(isExist) {
			if(fis.available()!=0) {
				p=(Person)ois.readObject();
				System.out.println(p.getPname()+" "+p.getPid());
			}else {
				isExist=false;
			}
		}
		ois.close();
		fis.close();
	}

}
