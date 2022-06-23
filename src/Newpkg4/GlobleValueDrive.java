package Newpkg4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobleValueDrive {

	public static void main(String[] args) throws IOException {
		
	Properties p=new Properties();
	
	FileInputStream f=new FileInputStream("C:\\Users\\yogisha.j\\eclipse-workspace\\Alrtpw\\src\\Config.properties");
	
	p.load(f);
	System.out.println(p.getProperty("browser"));
	
		
		/*p.setProperty("browser", "fire");
		
		System.out.println(p.getProperty("browser"));
		
		FileOutputStream fl=new FileOutputStream("C:\\Users\\yogisha.j\\eclipse-workspace\\Alrtpw\\src\\Config.properties");
		
		p.store(fl, null); */
	}

}
