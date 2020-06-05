package myproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class LetusWriteData
{
	String path="C:/Users/Monish/Desktop/FILEHANDLING/Demo.txt";
	public void LetusWriteData(String s) {
//		super();
		// TODO Auto-generated constructor stub
		System.out.println("writing program starts... ");
		
		File f=new File(path);
		try
		{
			FileWriter fw=new FileWriter(f);
			fw.write(s);
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("writing  ends");
	}
	public void appenFl(String s)
	{
		System.out.println("append starts...");
		File f=new File(path);
		try(FileWriter fw = new FileWriter(f, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(s+"\r\n");
			    //more code
			    
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		System.out.println("appends close");
	}
	
	
}
class LetusReadData
{
	public void Read(String s)
	{
		System.out.println("starts reading");
		String path="C:/Users/Monish/Desktop/FILEHANDLING/Demo.txt";
		File f=new File(path);
		try
		{
			FileReader fr=new FileReader(f);
			int len=(int)f.length();
			char[] c=new char[len];
			fr.read(c);
			String ch=new String(c);
			String emp="";

			for(int len1=0;len1<c.length;len1++)
			{
			for(int i=len1;i<len1+s.length();i++)
			{
				if(i<c.length)
				emp=emp+c[i];
				if(s.equals(emp))
				{
				   boolean j=false;
				   
				   int i1=i-(emp.length()-1);
				  String emp1="";
				   while(j!=true)
				   {
					  char c1=c[i1];
					   System.out.print(c1);
					   emp1=emp1+c[i1];
					   if(ch.endsWith(emp1))
					   {
						   j=true;
					   }
					   emp1="";
					   i1++;
				   }
				   
				   	
				}
				
			}
			emp="";
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Trying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts...");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		if(str1.equalsIgnoreCase("Writing"))
		{
		LetusWriteData ld=new LetusWriteData();
		
		System.out.println("Enter the type of writing you want to select");
		String str=sc.next();
		if(str.equalsIgnoreCase("Writing"))
		{
			ld.LetusWriteData("Monesh 101\r\nAmma 103\r\nAna 104\r\n");
		}
		else 
		{
			System.out.println("enter the data");
			String s3=sc.next();
			String s4=sc.next();
			ld.appenFl(s3+" "+s4);
		}
		}
		else
		{
			LetusReadData lrd=new LetusReadData();
			String s=sc.next();
			lrd.Read(s);
		}
	}
}