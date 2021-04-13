package raBi.MavenJava;

import org.testng.annotations.Test;

class extended_thread extends Thread
{
	String name = "Name :";
	String id = "ID :";
	@Test
	public void fristmethod()
	{
		multi_threading ml= new multi_threading();
		
		System.out.println("Start Thread "+id.strip()+Thread.currentThread().getId()
				+name.strip()+Thread.currentThread().getName());
		try
		{
			ml.thread_extended();
		}
		catch(InterruptedException e)
		{
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Start Thread "+id.strip()+Thread.currentThread().getId()+name.strip()
		+Thread.currentThread().getName());
	}
}

public class multi_threading 
{
	@Test
	public void thread_extended() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
