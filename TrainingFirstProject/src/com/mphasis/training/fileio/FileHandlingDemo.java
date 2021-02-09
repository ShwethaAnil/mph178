package com.mphasis.training.fileio;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
		File file=new File("sagarletter.txt") ;
		try (FileOutputStream fos = 
				new FileOutputStream(file)) {
			BufferedOutputStream bos=
					new BufferedOutputStream(fos);
			String data = "Some more contentSome more contentSome more content";
			bos.write(data.getBytes());
			bos.flush();
			fos.flush();
			System.out.println("done");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
//		}finally {
//			fos.flush();
//			fos.close();
//		}

	}

}
