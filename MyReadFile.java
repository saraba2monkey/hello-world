//Read the file called 'hello.txt' and print the file content
import java.io.*;
public class MyReadFile
{
	public static void main(String args[]){
	try{
		File f = new File("hello.txt");
		FileInputStream fis = new FileInputStream(f);
		int length = fis.available();
		for(int i =0;i<length;i++){
		System.out.print((char)fis.read()+"#");
		}
		System.out.println("\(^-^\)Hello world!");
	}
	catch(Exception e){
		/*error:File not found */
	 System.out.print("File not found.");
	}
	
	}
}