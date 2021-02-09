package com.mphasis.training.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mphasis.training.pojos.Person;

public class ReadObjectDemo {

	public static void main(String[] args)throws IOException, ClassNotFoundException{
		Person p1=new Person(123,"Manish");
		p1.setAdarNum("6756756");
		FileOutputStream fos=new FileOutputStream("persons.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Person(123,"Rakshitha"));
		oos.writeObject(new Person(124,"Sarika"));
		oos.writeObject(new Person(125,"Pooja"));
		oos.writeObject(new Person(126,"Rakshitha"));
		oos.writeObject(new Person(127,"Sarika"));
		oos.writeObject(new Person(128,"Pooja"));
		oos.writeObject(new Person(129,"Rakshitha"));
		oos.writeObject(new Person(130,"Sarika"));
		oos.writeObject(new Person(131,"Pooja"));
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
		System.out.println("Done");
		
//		FileInputStream fis=new FileInputStream("persons.txt");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		
//		Person person=(Person)ois.readObject();
//			Person person1=(Person)ois.readObject();
//			Person person2=(Person)ois.readObject();
////			Person person3=(Person)ois.readObject();
////			Person person4=(Person)ois.readObject();
////			Person person5=(Person)ois.readObject();
//		System.out.println(person2.getPname()+" "+person.getPname()+" "+person1.getPname());
//		//System.out.println(person3.getPname()+" "+person4.getPname()+" "+person5.getPname());
//		ois.close();
//		fis.close();
	}

}
