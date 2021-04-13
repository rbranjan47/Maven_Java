package raBi.MavenJava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class java_demo 
{
	@Test(priority = 1)
	private void javatestdemo() throws Exception
	{
		//added is blank method
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		System.out.println(multilineString.isBlank());
		
		//normally, isEmpty and isBlank is same methods but isBlank don't count space where as isEmpty counts blanks
		String multilineString1 = " ";
		System.out.println(multilineString1.isBlank());
		System.out.println(multilineString1.isEmpty());
		
		//to add the multiple string into set, list, map from collect method
		System.out.println(multilineString);
		System.out.println(multilineString.lines().collect(Collectors.toSet()));
        System.out.println(multilineString.lines().collect(Collectors.toList()));
        
        
        //to remove the space from both side
        String live = " name ";
        System.out.println("my"+live.strip()+"Jdk 11");
        //to remove space from START/TOP of string
        System.out.println("my"+live.stripLeading()+"Jdk 11");
        //to remove the space from the END/BOTTOM of the string
        System.out.println("my"+live.stripTrailing()+"Jdk 11");
        
        //to repeat the string multiple times
        String repeat = "Dummy Words";
        String repeated = repeat.repeat(40);
        System.out.println(repeated);
        //to get the count of lines
        System.out.println(repeated.lines().count());
        //to add in form og set and List
        System.out.println(repeated.lines().collect(Collectors.toList()));

        //reading strings from the Path file(txt format)
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Berlin, Germany’s"
        		+ " capithal, dates to the 13th century. Reminders of the "
        		+ "city's turbulent 20th-century history include its "
        		+ "Holocaust memorial and the Berlin Wall's graffitied "
        		+ "remains. Divided during the Cold War, its 18th-century "
        		+ "Brandenburg Gate has become a symbol of reunification. "
        		+ "The city's also known for its art scene and modern "
        		+ "landmarks like the gold-colored, swoop-roofed Berliner.");
        System.out.println(path);
        String str = Files.readString(path);
        System.out.println(str); 
        
        //transversing, Using traditional method for iterating the Object (String Object) in JAVA
        System.out.println(str.lines().collect(Collectors.toList()));
        List<String> list = str.lines().collect(Collectors.toList());
        //Iterating for reading the line
        Iterator<String>  itr = list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        //transversing, Using through Java 8, we can iterate through foreach()
        //Consumer is an anonymous class
        list.forEach(new Consumer<String>()
        {
        	public void accept(String s)
        	{
        		System.out.println(s);
        	}
        }
        );
        
        
       List<Integer> list_int = new ArrayList<Integer>();
       //generic method
       for (int i=0; i<100; i++)
       {
    	   list_int.add(i);
       }
	}
	
	@Test(priority = 2)
	private void javademotest()
	{
		String num = "1 \n 2 \n 3 \n 4 \n 5 \n 6";
	       List<String> value = num.lines().collect(Collectors.toList());
	       System.out.println(value);
	       
	       //Stream----> Sequential
	       Stream<String> str_seq = value.stream();
	      System.out.println(str_seq);
	      
	       //Stream----> Parallel Stream
	       Stream<String> str_prl = value.parallelStream();
	       System.out.println(str_prl);
	}
}
